# design-patterns-project

## Team members
Leon Kattendick, Tarek Abouzaid, Dominik Dorr

# Idea
An application which can handle mulitple alien languages and can encode and decode them. The target language for decoding 
is always the one used for encoding. This application helps the human race to communicate with other species and yet enhance interplanetary communication.
The application currently supports to languages: Luminara and Zentari. It can be started over the command line interface.

# Used Design Patterns

## Facade
Use: The Facade makes it easier to interact with our translation application as it only provides one method to be called.
It simplifies interacting with our system as other systems do not need to worry about logical execution of our code.

## Singelton
Use: As the Facade should only be instantiated once, we used the singelton pattern

## Strategy Pattern
Use: As there can be multiple alien languages and we want to be open for extension but closed for modification we used the strategy pattern.
Now we can simply add as many languages as we want without any problems. We just need to add the languages to our facade, which will then be dynamically chosen over the enum provided.

## Chain of Command
Use: This design pattern is used twice. On the one hand as the LanguageIdentifier, were we are going through all LanguageIdentifiers and try to find out which one fits for decoding. 
On the other hand as the LanguageConverter as encoding and decoding a message could have several steps. 
This improves code clarity as the single encoding and decoding steps are decoupled and each step is only responsible for one change. 
Also this helps with the Open/Closed principle as it is easy to add more steps to encode and decode certain languages, without changing the current steps.

# Feedback
We definitely think that those patterns are pretty complementary and are working seamlessly together. 
We also tried to pick some based on the domain of the application which definitely had a huge impact on our decisions. To sum it up - it was a fun exercise where
we were able to put our heads together and came up with a pretty nice solution.



