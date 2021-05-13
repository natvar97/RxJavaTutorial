package com.example.rxjavatutorial

class OperatorCountExaple {

    /*

        * not get output

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val observable = getObservable()
        observable
            .filter { user ->
                return@filter user.name.equals("male", ignoreCase = true)
            }
            .count()
            .subscribe(getObserver())

    }

    private fun getObserver(): SingleObserver<Long> {
        return object : SingleObserver<Long> {
            override fun onSubscribe(d: Disposable) {
                Log.e("tag", "All item emitted successfully")
            }

            override fun onSuccess(t: Long) {
                Log.e("tag", "count : ${t}")
            }

            override fun onError(e: Throwable) {
                Log.e("tag", "on Error : ${e.message}")
            }

        }
    }

    private fun getObservable(): Observable<User> {
        val males = arrayOf("Mark", "John", "Trump", "Obama")
        val females = arrayOf("Lucy", "Scarlett", "April")

        val users = ArrayList<User>()

        for (name in males) {
            val user = User(name, "male")
            users.add(user)
        }

        for (name in females) {
            val user = User(name, "female")
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

     */

}