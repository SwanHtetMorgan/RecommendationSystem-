# Recommendation System prototype with java core for E Learning 

 - Author - Swan Htet Aung Phyo

## Algorithm Usage 

- Neutral Language processing
- Cosine Similarity Calculation 
- Vector for the string 

## Library 
- Apache Commons
- 
### User Story 

-  As the registered User, I want the system to recommend me with the new Courses that  I don't Enrolled yet 
- So that I want recommendation for the new courses that will match my previous registered courses and my search History

### Acceptance 

- recommendation system to suggest 5 new courses that will match user's current courses 


### How does this system work in the nutshell?

    Based on the courses in the databases and user registered courses with search keyword, 
    we will calculate the cosinesimilarity between this two vector.
    If the result is high score which will be between 0.0 and 1.0, we will 
    show the course with that result to the user.

### Current Version Vs Final expected Version 

#### Current 
    
    Based on the courses in the databases and user registered courses with search keyword, 
    we will calculate the cosinesimilarity between this two vector.
    If the result is high score which will be between 0.0 and 1.0, we will 
    show the course with that result to the user.
    I don't calcute the result including the popularity , review star and the insurance score for the Job opptunity in real world


#### Final Version 

    Will calculate based on the popularity , review star and the insurance score for the Job opptunity in real world




## Result 

![img_1.png](img_1.png)
    
    
