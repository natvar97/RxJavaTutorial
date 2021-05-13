package com.example.rxjavatutorial

class OperatorMap {

    /*
            private var disposable: Disposable? = null

            override fun onCreate(savedInstanceState: Bundle?) {
                super.onCreate(savedInstanceState)
                setContentView(R.layout.activity_main)

                getObservable()
                    .subscribeOn(Schedulers.io())
                    .observeOn(AndroidSchedulers.mainThread())
                    .map { user ->
                        user.email = String.format("${user.name}@rxjava.com")
                        user.name = user.name!!.uppercase(Locale.ROOT)
                        user
                    }
                    .subscribe(object : Observer<User> {
                        override fun onSubscribe(d: Disposable) {
                            disposable = d
                        }

                        override fun onNext(t: User) {
                            Log.e("tag", "onNext : ${t.name}, ${t.email} , ${t.gender}")
                        }

                        override fun onError(e: Throwable) {
                            Log.e("tag", "${e.message}")
                        }

                        override fun onComplete() {
                            Log.e("tag", "All items emitted successfully")
                        }

                    })

            }

            private fun getObservable(): Observable<User> {
                val males = arrayOf("mark", "john", "trump", "obama")

                val users = ArrayList<User>()
                for (name in males) {
                    val user = User()
                    user.name = name
                    user.gender = "Male"
                    users.add(user)
                }

                return Observable.create(object : ObservableOnSubscribe<User> {
                    override fun subscribe(emitter: ObservableEmitter<User>) {
                        for (user in users) {
                            if (!emitter.isDisposed)
                                emitter.onNext(user)
                        }
                        if (!emitter.isDisposed)
                            emitter.onComplete()
                    }
                }).subscribeOn(Schedulers.io())

            }

            override fun onDestroy() {
                super.onDestroy()
                disposable!!.dispose()
            }
     */

}