# design-patterns-project

## Team members
Leon Kattendick, Tarek Abouzadi, Dominik Dorr
# Idea
An application which can handle mulitple alien languages and can encode and decode them. The target language for decoding 
is always german. This application helps the human race to communicate with other species and yet enhance interplanetary communication.

# Used Design Patterns

## Facade
Use: The facade makes it easier to interact with our translation application as it only provides one method to be called.
It simplifies interacting with our system as other systems do not need to worry about logical execution of our code.

## Singelton
Use: As the Facade should only be instantiated once, we used the singelton pattern

## Strategy Pattern
Use: As there can be multiple alien languages and we want to be open for extension but closed for modification we used the strategy pattern here.
Now we can simply add as many languages as we want without any problems. We just need to add the languages to our facade.

## Chain of Command
Use: This design pattern is used twice. On the one hand as the LanguageIdentifier, were we are going through all LanguageIdentifiers as
Zentari and Luminara and try to find out which one fits for decoding. On the other hand as the LanguageConverter as encoding and decoding a message
could have several steps. (sample: Luminara)

## Feedback
We definitly think that those patterns are pretty complementary but are still working seamlessly together. We also tried to pick some
based on the domain of the application which definitly had a huge impact on our decisions. To sum it up - it was a fun exercise where
we were able to put our heads together and came up with a pretty nice solution.



