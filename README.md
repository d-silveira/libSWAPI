# **libSWAPI**

## Star Wars API web-service easy wrapper library for Android

### It uses Retrofit2 + RxJava2, the Clean Design Pattern, KISS (Keep it Simple Stupid), and as best Android programming practices has possible.

---

### **Getting Started**

#### Using

To use this library all you need to do is initialize the **ConnectionSwapi(@NotNull CompositeDisposable compositeDisposable)**, with a compositeDisposable to dispose of the connection when you destroy your view, and then call on **getSwapiConnection()**'s methods to retrieve different data from the *SWAPI* web-service. I recommend you initialize it only once through dependency injection, so as to avoid memory leaks, and share only one connection to the server across your entire app.

If you want auto proper multithread handling use it's helper method **prepareRequest(@NotNull Observable<?> swapiConnectionRequest)** which receives one of swapiConnection's method calls and returns an Observable to which you can subscribe *ala Builder Pattern* with the handlers you see fit.

You should always add the return of each subscribe to the compositeDisposable and onDestroy call it's dispose method to immediately sever no longer useful connections, and to clear it's resources.

#### Contributing

Contributions are welcome!

If you wish to extend the resources coverage, you can create a resource_plugin. Here's how:
1. under package data.entity.plugin_resources create a new package with the resource's name and under it create the Gson Classes needed for the new resource.
2. then on the data.api.APISwapi Interface create a new section for that resource with the Retrofit2 calls relevant to that resource.
3. finally on the java/test under the connection.plugin_resources package create a new UnitTest Class with that resource's name and inside it for each API call create a @test method and test to make sure the plugin is effective.
