package com.example.rxjavatutorial

class OperatorDistinceForObjects {

    /*

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val notesObservable = getNotesObservable()
        notesObservable.subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .distinct()
            .subscribe(getNotesObserver())

    }

    private fun getNotesObservable(): Observable<Note> {
        val notes = prepareNotes()

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

    private fun getNotesObserver(): DisposableObserver<Note> {
        return object : DisposableObserver<Note>() {
            override fun onNext(t: Note) {
                Log.e("tag", t.note)
            }

            override fun onError(e: Throwable) {
                Log.e("tag", "${e.message}")
            }

            override fun onComplete() {
                Log.e("tag", "All items emitted successfully")
            }
        }
    }

    private fun prepareNotes(): List<Note> {
        val notes = ArrayList<Note>()

        notes.add(Note(1, "Buy tooth paste!"))
        notes.add(Note(2, "Call brother!"))
        notes.add(Note(3, "Call brother!"))
        notes.add(Note(4, "Pay power bill!"))
        notes.add(Note(5, "Watch Narcos tonight!"))
        notes.add(Note(6, "Buy tooth paste!"))
        notes.add(Note(7, "Pay power bill!"))
        return notes
    }
     */

}