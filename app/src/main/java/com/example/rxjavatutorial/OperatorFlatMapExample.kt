package com.example.rxjavatutorial

class OperatorFlatMapExample {

    /*
        private var disposable: Disposable? = null

        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_main)

            getUserObservable()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .flatMap {
                    return@flatMap getAddressObservable()
                }
                .subscribe(object : Observer<User> {
                    override fun onSubscribe(d: Disposable) {
                        disposable = d
                    }

                    override fun onNext(t: User) {
                        Log.e("tag", "${t.name} , ${t.gender} , ${t.address}")
                    }

                    override fun onError(e: Throwable) {

                    }

                    override fun onComplete() {
                        Log.e("tag", "all items emitted successfully")
                    }

                })

        }

        private fun getAddressObservable(): Observable<User> {
            val addresses = arrayOf(
                "1600 Amphitheatre Parkway, Mountain View, CA 94043",
                "2300 Traverwood Dr. Ann Arbor, MI 48105",
                "500 W 2nd St Suite 2900 Austin, TX 78701",
                "355 Main Street Cambridge, MA 02142"
            )

            return Observable.create(ObservableOnSubscribe<User> { emitter ->
                val address = Address(Locale.US)
                address.adminArea = addresses.random()
                if (!emitter.isDisposed) {
                    val user = User()
                    user.address = address

                    Thread.sleep((Random.nextInt(1000) + 0).toLong())
                    emitter.onNext(user)
                    emitter.onComplete()
                }
            }).subscribeOn(Schedulers.io())
        }

        private fun getUserObservable(): Observable<User> {
            val males = arrayOf("mark", "john", "trump", "obama")

            val users = ArrayList<User>()
            for (name in males) {
                val user = User()
                user.name = name
                user.gender = "Male"
                users.add(user)
            }

            return Observable.create(ObservableOnSubscribe<User> { emitter ->
                for (user in users) {
                    if (!emitter.isDisposed)
                        emitter.onNext(user)
                }
                if (!emitter.isDisposed)
                    emitter.onComplete()
            }).subscribeOn(Schedulers.io())

        }

        override fun onDestroy() {
            super.onDestroy()
            disposable!!.dispose()
        }
     */
}