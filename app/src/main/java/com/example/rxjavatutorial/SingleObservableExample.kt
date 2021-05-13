package com.example.rxjavatutorial

class SingleObservableExample {
    /*
            private var disposable : Disposable? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        getNotesObservable()
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe(getNotesObserver())

    }

    private fun getNotesObserver() : SingleObserver<Note> {
        return object : SingleObserver<Note>{
            override fun onSubscribe(d: Disposable) {
                disposable = d
            }

            override fun onSuccess(t: Note) {
                Log.e("tag" , t.note)
            }

            override fun onError(e: Throwable) {
                Log.e("tag" , "${e.message}")
            }
        }
    }

    private fun getNotesObservable() : Single<Note> {
        return Single.create { emitter ->
            val note = Note(1, "Buy a milk!")
            emitter.onSuccess(note)
        }
    }
     */
}