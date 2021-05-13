package com.example.rxjavatutorial

import android.os.Bundle
import android.util.Log
import io.reactivex.Observable
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.observers.DisposableObserver
import io.reactivex.schedulers.Schedulers
import java.util.*
import kotlin.collections.ArrayList

class CompositeDisposableExample {

    /*
    private lateinit var compositeDisposable: CompositeDisposable

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        compositeDisposable = CompositeDisposable()

        compositeDisposable.add(getNotesObservable()
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .map { note ->
                note.note = note.note.uppercase(Locale.getDefault())
                note
            }
            .subscribeWith(getNotesObserver())
        )

    }

    private fun getNotesObserver(): DisposableObserver<Note> {
        return object : DisposableObserver<Note>() {
            override fun onNext(note: Note) {
                Log.e("tag", note.note)
            }

            override fun onError(e: Throwable) {
                Log.e("tag", "${e.message}")
            }

            override fun onComplete() {
                Log.e("tag", "All items are emitted")
            }

        }
    }

    private fun getNotesObservable(): Observable<Note> {
        val notes: List<Note> = prepareNotes()

        return Observable.create { emitter ->
            for (note in notes) {
                if (!emitter.isDisposed) {
                    emitter.onNext(note)
                }
            }
            if (!emitter.isDisposed) {
                emitter.onComplete()
            }
        }
    }

    private fun prepareNotes(): List<Note> {
        var notes: ArrayList<Note> = ArrayList()
        notes.add(Note(1, "Hii"))
        notes.add(Note(2, "Kem 6o"))
        notes.add(Note(3, "Majama"))
        notes.add(Note(4, "Jalsa bhai"))
        notes.add(Note(5, "moj moj"))

        return notes
    }

    override fun onDestroy() {
        super.onDestroy()
//        compositeDisposable.dispose()
        compositeDisposable.clear()
    }

     */
}

