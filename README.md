# Application
A lambda application written in java.

## Build
```
./gradlew clean build
```

## Run local
```
./gradlew run
```


# Deployment Pipeline for a Serverless Application

![pipeline-screenshot](images/pipeline-screenshot.png)


Services Used:
 
 * [AWS CodePipeline](https://aws.amazon.com/codepipeline/) for pipeline creation.
 * [AWS CodeBuild](https://aws.amazon.com/codebuild/) for testing and building your Go application(s).
 * [AWS CloudFormation](https://aws.amazon.com/cloudformation/) for deploying infrastructure (Infrastructure-as-Code).

