# UW Homework: Basic Kotlin
This homework is designed to force you to exercise your knowledge of the Kotlin programming language. This homework does not involve Android in any way.

> Notes like this are intended to explain the intent or thinking behind parts of the homework assignment, and are not necessary to read in order to accomplish the homework's goals. Consider them "flavor text" if you want to understand more of the "why" behind what we are doing here.

This homework uses Gradle from the command-line to host the `Homework.kt` file (which you will modify) and the `HomeworkTest.kt` file (which tests your code, and you should not modify).

> This assignment, and the one that follows, contains extensive instructions; future homework assignments will not, because I want to encourage you to solve problems your own way. This is just to get us started.

## Goal
Your task is simple: ***Make the code compile, and make all the unit tests pass.***

## Tools
This project uses nothing about Android, so we will not use Android Studio for this project. Instead, you will only need a good text editor. You could use Android Studio to edit the Kotlin source files, but it might give you some false errors about missing symbols and what-not; instead, consider using [Visual Studio Code](https://code.visualstudio.com/), which is a popular editor for many languages and all of the widely-used platforms (Windows, macOS, Linux).

> Other options include using [IntelliJ IDEA (Community Edition)](https://www.jetbrains.com/idea/download/), which is the base from which Android Studio is built, or some other text editor with IDE capabilities, like Eclipse, but in the end, knowing how to do a build from the command-line is useful, and I do want to try and keep things simple--believe it or not, what we're doing here is actually simpler than some options we could be using. As much as I can, I don't want to complicate things for this first project; I want you to focus exclusively on Kotlin. The Gradle wrapper, combined with a good text editor like Visual Studio Code, should be all you need for this assignment.

### Command line
You will need only the command-line ("Terminal" on macOS, "Terminal" or "xTerm" on Linux, or "Command Prompt" on Windows). These should already be present on your system of choice.

> Developers should always have a working knowledge of the command-line. You won't always need to use the command-line for everything, but you should at least be conversant with how it maps to your project inside of the IDE. It is a highly-useful skill to have, particularly when looking to automate certain tasks, and many companies' interviews will assume you have some knowledge of it.

> Additionally, if you're on macOS, many developers like using [iTerm2](https://iterm2.com/downloads.html). Windows developers like the new [Windows Terminal](https://www.microsoft.com/en-us/p/windows-terminal/9n0dx20hk701), which can wrap either the [Windows Subsystem for Linux](https://docs.microsoft.com/en-us/windows/wsl/install-win10) or [Powershell](https://docs.microsoft.com/en-us/powershell/) (which already comes with modern builds of Windows 10). Getting to know these is useful, but certainly not required for this class.

### Git
You will, however, need to have Git installed on your machine--if you are on macOS, Git will already be installed; on Windows, the standard Windows download for Git will include a "Git Prompt" which will include Git as part of the setup.

> Git is the standard disributed version control system of choice. GitHub is the most popular online Git hosting facility, but others are available, including GitLab and BitBucket. If you end up working with a really old codebase, you may still end up using "SVN" (Subversion), which was the standard of choice prior to Git's widespread adoption around the mid-2000s.

### Anything else
The rest will be installed by the Gradle Wrapper script that is checked in as part of the project. This is important, because Gradle is the build system used by Android Studio to build Android applications, so it's useful to know how to interact with Gradle just a little bit.

> Gradle is a build tool, much like "make", "MSBuild", "Ant", and a whole host of others. Gradle scripts can be written in either Kotlin or Groovy (another language that runs on the JVM, like Kotlin). You won't need to understand much about Gradle (until maybe your final project in this class, when you might need to add some third-party libraries) to use it, so we won't spend a lot of time on it. There's a whole heap of interesting functionality buried within Gradle, however, and it can be very useful to know, particularly when you are trying to debug certain kinds of problems. It might help to go through the [Gradle Getting Started page](https://docs.gradle.org/current/userguide/getting_started.html) if you want to dive in.

## To obtain this code...
... you must first obtain a copy of the source. You do that by cloning this repository. Open a "Command Prompt" or "Terminal" instance and use:

    git clone https://github.com/tedneward/uw-basic-kotlin basickotlin

... to do the deed. This will also create a local copy of the project on your machine in a directory called `basickotlin`.

To compile and run the tests, execute `gradlew` (if you are on macOS or Linux) or `gradlew.bat` (if you are on Windows), which will download and install a local copy of Gradle, and then pull down a host of plugins to build the app locally and then run the tests. (If you are on a macOS/Linux machine, you may need to explicitly reference the current directory when you run the `gradlew` script, so if `gradlew` by itself yields an error, try `./gradlew` instead.)

Run `gradlew` or `gradlew.bat` now. You should see Gradle give you a greeting and then a series of things should be downloaded to your machine. It could take upwards of 20 to 30 seconds, or longer, depending on your Internet speeds.

Next, run `gradlew test`. This will tell Gradle to try to compile the project code and run the tests. If it succeeds, you will get output that looks something like:

```
BUILD SUCCESSFUL in 537ms
3 actionable tasks: 3 up-to-date
```

Right now, though, you will get a ton of errors; this is because the tests are trying to compile code that doesn't exist yet, because you haven't written it yet!

## Now what?
If you do not see the `Homework` and `HomeworkTest` files at first, you can find them here:

* `src/main/kotlin/edu/uw/basic-kotlin/Homework.kt`
* `src/test/kotlin/edu/uw/basic-kotlin/HomeworkTest.kt`

Note that you will do all of your work in the `Homework.kt` file, and you should not need to modify anything in the `HomeworkTest.kt` file; in fact, modifying that file could jeopardize your grade! If you feel you need to make changes to it, contact the TA before doing so--chances are very good that the problem lies elsewhere.

> One exception to the "don't modify `HomeworkTest.kt` would be if you wanted to *add* tests to the ones already there. Writing unit tests in Kotlin is outside the scope of this exercise, however, and while a useful learning tool, this is not something we expect you to be able to do yet. If you wish to persist, we will offer 1 point of extra credit if you can add 6 or more tests to the ones already there without changing the `Homework.kt` code we've asked you to write; in other words, no new functions or object properties or methods. Just test the ones already there.

> Additionally, when programming, it can often be *very* helpful to take the tasks that need to be done and break them into small pieces, verify that part of it works, then move on to the next part. That will be hard with the way the tests are currently written. Thus, if you wish, you can go into the `HomeworkTest.kt` file, comment out the tests that are giving you errors inside the "HomeworkTest" class, and then run again. That will allow you to tackle each part independently--just don't forget to uncomment the test code, or it's a zero!

## To make your changes and upload to your own GitHub account
You can make changes to the code on your local machine, but you cannot just change the code in my project on GitHub; it will be the template for other UW classes in the future. To store your own changes to your own GitHub account, you need to set the "remote origin" for this code you just cloned. 

To do that, you need to create a new repository in your account on GitHub (call it `basickotlin`), and then change the project's "remote origin" setting to point to that new repository as the remote origin. (If you don't do this, you will not have anything checked in online, and thus will have nothing turned in for the assignment!) To change the remote origin, use the following:

    git remote set-url origin https://github.com/[your-ID]/basickotlin.git

This will work regardless of whether you got the syntax of the URL correct or not, so do a quick push to make sure it all worked correctly:

    git push

Git will ask you for your username and password, then (if everything was done correctly), it will upload the code to the new repository, and this is your new "home" for this project going forward. Verify the files are there by viewing your GitHub project through the browser.

***NOTE:*** Your grade for this assignment (and all future assignments) will be based on what we see in the GitHub repository, and nothing else. If it isn't in GitHub, it doesn't exist.

> #### "... but I learned a different way to do this."
> You are free to use whatever other means you like to clone the repo for your own use, of course, but this is what I've found works for classes in the past. Just remember, *you* are responsible for what's in your GitHub repo, so when in doubt, verify the contents and/or ask myself or the TA if we see the same contents that you do. 

Remember Reagan's Maxim: ***[Trust but verify!](https://en.wikipedia.org/wiki/Trust,_but_verify)***

## The assignment
The code is broken into a sequence of sections. Your job is to implement the body of each section, so that the tests will pass.

The first section is intended as an opportunity to experiment with `when`. The `whenFn` takes an `Any` argument, and depending on the value of that argument, will return a String containing "world", "zero", "one", "Say what?" or "I don't understand", according to the following table:

* If it is "Hello", return "world"
* If it is any other string, return "I don't understand"
* If it is 0, return "zero"
* If it is 1, return "one"
* If it is any number between 2 and 10, return "low number"
* If it is any other number, return "a number"
* Otherwise, return "I don't understand"

> This is a nonsense method designed to force you to explore the Kotlin control flow constructs. The number of times I've had to write a function like this is really, really low.

The second section is to explore some function syntax. First, write two global functions, "add" and "sub" (subtract), which do exactly as you might expect: take two integers, and add them ("add") or subtract them ("sub") and return the result. Then, write a third function, called "mathOp", which takes two integers and a function argument that takes two integers and returns an int. In the body of `mathOp`, call the passed-in function argument with the two integer arguments, and return the result. (In other words, `mathOp` will simply turn around and call the function argument passed in.)

> Understanding how to pass functions around as part of Kotlin syntax will prove to be extremely helpful in a number of different situations. Don't skimp on this--make sure you get how this works, because it's not something that's commonly done in Java--until very, very recently.

The third section is to explore classes. You are to create a standard "POJO"-type class called "Person", which should have three properties (firstName, a String; lastName, a String; and age, an Int), and provide a constructor that takes all three properties as arguments. Define a read-only "debugString" property on it that returns a String containing the Person data in a format like this: "[Person firstName:Ted lastName:Neward age:45]", where of course the values depend on what was used to construct the Person class.

> Normally, for a class like this, you would also want to define an `equals` and `hashCode` method, to determine if two Person objects contain the same values, but this is actually a pretty complicated thing to do, and I don't want to leave you to think that it's trivial when it's not. Additionally, normally, one would override the `toString` method to provide some debug-style output, but it's helpful to know how to define a compound property like the `debugString` one above, so we'll go with that.

The fourth section is to explore classes and operator overloading. Create a class, "Money", that has two properties, `amount` and `currency`. "Currency" can be one of "USD", "EUR", "CAN" and "GBP". "Amount" is a standard Int. Define the properties such that "amount" can never be less than zero, and that "currency" can only be one of those four symbols. Define a public method, `convert`, that takes a String argument for the currency type to convert to, and return a new Money instance with the amount converted. Conversion rates should be as follows: 

* 10 USD converts to 5 GBP (2 USD == 1 GBP)

* 10 USD converts to 15 EUR (2 USD == 3 EUR)

* 12 USD converts to 15 CAN (4 USD == 5 CAN)

(Make sure you can convert in both directions, and for all combinations, such as GBP to EUR, CAN to GBP, and so on!) 

Define the `+` operator on Money to return a new instance of Money that adds the amount, converting the currency to the first (left-hand) Money's currency. So adding (10 USD) + (5 GBP) should return a result in USD. Similarly, adding (5 GBP) + (10 USD) should return the result in GBP. 

> You do not need to worry about the `-` operator for this assignment, but in practice whenever you define one, you should define the other just to make sure the class behaves intuitively.
