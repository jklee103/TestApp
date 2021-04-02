package com.example.architecterapp

import androidx.annotation.MainThread
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Observer
import timber.log.Timber
import java.util.concurrent.atomic.AtomicBoolean

//생명주기에 안전하게 이벤트 처리
class SingleLiveEvent<T>: MutableLiveData<T>() {
    private final var mPending = AtomicBoolean(false)

    @MainThread
    override fun observe(owner: LifecycleOwner, observer: Observer<in T>) {
        if(hasActiveObservers()){
            Timber.w("옵저버 여러개지만 하나만 받을 수 있다.")
        }
        super.observe(owner, { t-> if (mPending.compareAndSet(true, false))
        {
            observer.onChanged(t)
        } })
    }

    @MainThread
    override fun setValue(value: T) {
        mPending.set(true)
        super.setValue(value)
    }

    //setvalue에 null 넣는 함수 있는데 코틀린은 not null..
}