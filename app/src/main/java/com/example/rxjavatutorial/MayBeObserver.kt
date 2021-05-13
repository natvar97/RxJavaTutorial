package com.example.rxjavatutorial

class MayBeObserver {
    /*
            private var disposable: Disposable? = null

            override fun onCreate(savedInstanceState: Bundle?) {
                super.onCreate(savedInstanceState)
                setContentView(R.layout.activity_main)

                getMayBeObservable()
                    .subscribeOn(Schedulers.io())
                    .observeOn(AndroidSchedulers.mainThread())
                    .subscribe(getMayBeObserver())

            }

            private fun getMayBeObservable() : Maybe<Note> {
                return Maybe.create(object : MaybeOnSubscribe<Note> {
                    override fun subscribe(emitter: MaybeEmitter<Note>) {
                        if (!emitter.isDisposed){
                            val note = Note(1 , "Let's go and play cricket")
                            emitter.onSuccess(note)
                        }
                    }

                })
            }

            private fun getMayBeObserver(): MaybeObserver<Note> {
                return object : MaybeObserver<Note> {
                    override fun onSubscribe(d: Disposable) {
                        disposable = d
                    }

                    override fun onSuccess(t: Note) {
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
     */
}