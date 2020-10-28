
# DevFest Afghanistan 2020 Mobile Track

This is the repo for the mobile track of Devfest Afghanistan 2020. You can use this repo as your reference to check all the topics that got covered.

## Targeted audience  :family: 
This repo is for those who wanted to kickstart android development or just started and looking for a reference app that will teach them a few advanced concepts.

## Goal  :dart:
The goal of the DevFest Afghanistan 2020 mobile track is to teach you Android development with Koltin by covering basics and intermediate topics by creating a BookMyShow movie listing. The mobile track is divided into 3 levels

1. Beginner - Covering Android UI basics.
2. Intermediate - Covering [Retrofit](https://square.github.io/retrofit/) to make an API request to remote server and [RecyclerView](https://developer.android.com/guide/topics/ui/layout/recyclerview).

In the end, you will get an app with a nice movie listing UI.

 Please note we are using [the movie DB API](https://developers.themoviedb.org/3) to get movies from the remote server.
To get movies from API you would need an API key. 
>
> Try this in your code: 
>    ```kotlin
>    companion object {
>        private const val API_KEY = "7bc0651fe0ea5973822df3bd27e779d9"
>    }
>    ```
> We would recommend to generate your own API key and use it if above key is not working. Please follow the below steps to configure your own API key. 
>
>1. Register yourself on https://www.themoviedb.org/signup 
>2. Fill all the required details to signup. 
>3. Open your email and verify the email to get started. (Activate your account)
>4. Do login with the username and the password(you provided during signup)
>5. On Top right corner -> Click on your profile icon -> Settings -> API  -> Request an Api Key -> Choose developer option(for demo/sample project ) -> Accept the terms -> Fill all the required details (You can give dummy value for application url as you won’t be having that, give good summary for application summary) -> Submit -> Copy API key and use.
>

## Screenshot

![Screenshot of app](https://github.com/jawidMuhammadi/devfest20-afghanistan-android/blob/master/app/src/main/assets/screenshot.png)


# Why Kotlin?
- Statically typed, object-oriented, modern programming language
- Properties and extenstions classes
- Created from developers for developers
- Concise, much less boilerplate code than some other lanuguages
- Increase null safety with nullable and non-nulllable data types
- Open sourced
- Supports lambdas and higher-order functions
- Fully compatible with the Java language, so that you can migrate over time and continue using your favourite libraries
- Officically supported for Android development, and included with Intelli and Android Studio

