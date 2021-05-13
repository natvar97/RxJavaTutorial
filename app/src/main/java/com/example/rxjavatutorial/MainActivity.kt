package com.example.rxjavatutorial

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import io.reactivex.Observable
import io.reactivex.ObservableEmitter
import io.reactivex.ObservableOnSubscribe
import io.reactivex.Observer
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.Disposable
import io.reactivex.schedulers.Schedulers

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Observable.concat(getMaleObservable(), getFemaleObservable())
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe(object : Observer<User> {
                override fun onSubscribe(d: Disposable) {
                    Log.e("tag", "subscribed")
                }

                override fun onNext(t: User) {
                    Log.e("tag", t.name)
                }

                override fun onError(e: Throwable) {
                    Log.e("tag", "${e.message}")
                }

                override fun onComplete() {
                    Log.e("tag", "All items emitted Successfully")
                }

            })


    }

    private fun getFemaleObservable(): Observable<User> {
        val females = arrayOf("Lucy", "Scarlett", "April")

        val users = ArrayList<User>()

        for (female in females) {
            val user = User(female, "female")
            users.add(user)
        }

        return Observable.create(ObservableOnSubscribe<User> { emitter ->
            for (user in users) {
                if (!emitter.isDisposed) {
                    Thread.sleep(500)
                    emitter.onNext(user)
                }
            }
            if (!emitter.isDisposed)
                emitter.onComplete()
        }).subscribeOn(Schedulers.io())
    }

    private fun getMaleObservable(): Observable<User> {
        val males = arrayOf("Mark", "John", "Trump", "Obama")

        val users = ArrayList<User>()

        for (male in males) {
            val user = User(male, "male")
            users.add(user)
        }

        return Observable.create(ObservableOnSubscribe<User> { emitter ->
            for (user in users) {
                if (!emitter.isDisposed) {
                    Thread.sleep(500)
                    emitter.onNext(user)
                }
            }
            if (!emitter.isDisposed) {
                emitter.onComplete()
            }
        }).subscribeOn(Schedulers.io())
    }

}

/*
            private fun getPersons(): List<Person> {
            val persons: MutableList<Person> = ArrayList()
            val p1 = Person("Lucy", 24)
            persons.add(p1)
            val p2 = Person("John", 45)
            persons.add(p2)
            val p3 = Person("Obama", 51)
            persons.add(p3)
            return persons
        }

 */