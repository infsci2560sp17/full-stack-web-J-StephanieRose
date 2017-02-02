# PenPal reLOADED

PenPal reLOADED is a new twist on an old concept. Unlike other pen pal approaches, we allow you to connect with people who have similar interests and tastes that allow you to expand your communication outside of your normal friend circle and learn more about the world around you. 


# Assignment 1.2 - Due 28 Jan 2017
Question 1. What is the proposed name for your Web application? 

       PenPal reLoaded, the idea is that this application would be a new twist on an old concept.

Question 2. Who is the target audience for your Web application?

       18-35, this is the target audience mainly to avoid age consent 
requirements. Additionally, if this application were to be a success, it 
would more than likely branch out to all ages. K-12 and if there is a market 
for it, elderly communities for individuals who may not have a lot of mobility, 
but would like to communicate to people outside of their homing environments.

Question 3. What problem is it intended to solve for the target audience?

       Having a chance to get to know people outside of their normal circle 
       
       through common interests and hobbies.

Question 4. How will it meet the minimum project requirements?

       It will meet the minimum project requirements by allowing people to 
       create a log in page, link FB and Instagram profiles, etc.

Question 5. Why is your proposed Web application unique or creative beyond 
simply meeting the minimum requirements?

       My proposed web application is unique beyond simply meeting the 
       minimum requirements because it will have the intended target audience, 
       but also due to its nature could be used as an outlet for university 
       students and other specialized groups to continue to bridge the gap 
       between various international communities.

Additional Task
https://github.com/infsci2560sp17/full-stack-web-J-StephanieRose/blob/master/CHANGELOG.md


## Build status

[![Build Status](https://travis-ci.org/infsci2560sp17/full-stack-web-J-StephanieRose.svg?branch=master)


## Web Site

https://penpal-reloaded.herokuapp.com/

## Key Features

* Online interconnectivity with possible offline capabilities (you shouldnt be constrained to only socializing online)
* You can sync your social media to your PenPal profile to find people you share common interests with
* PenPal University **coming soon** (allows you to collaborate on academic projects with other students in and outside of your university)

## Project Details

### Landing Page

       For the landing page, I plan on creating a logo with adobe creative suite. If feasible, I hope to have it animated. Additionally, the color scheme for my site will be yellow, blue, black, and white. 
       

### User Input Form

TODO : please provide a description of at least 1 user input form including a screen shot ![](https://.../image.jpg)

## API

TODO : please provide a description of at least 1 API including a sample of request data and response data in both XML and JSON format.

### API Method 1

    POST photos/:id/tags

#### Parameters

- **id** _(required)_ — The Photo ID to add tags for.
- **tags** _(required)_ — Comma separated tags.

#### Response

A JSON or XMLobject containing the PhotoID and list of tags accepted.

#### Errors

All known errors cause the resource to return HTTP error code header together with a JSON array containing at least 'status' and 'error' keys describing the source of error.

- **404 Not Found** — The photo was not found.

#### Example

##### Request

    POST /v1/photos/123456/tags

##### Body

    tags=cute,puppy


##### JSON Response

```json
{
    "photoId": 123456,
    "tags": ["cute", "puppy"]
}
```

##### XML Response

```xml
<?xml version="1.0" encoding="UTF-8"?>
<PhotoTags>
    <photoId>123456</PhotoId>
        <tags>
            <tag>cute</tag>
            <tag>puppy</tag>
        </tags>
</PhotoTags>
```

## Technologies Used

TODO : List all technologies used in your project

- [Spring Boot](https://projects.spring.io/spring-boot/) - Takes an opinionated view of building production-ready Spring applications.
- [Thymleaf](http://www.thymeleaf.org/) - Thymeleaf is a modern server-side Java template engine for both web and standalone environments.
- [Maven](https://maven.apache.org/) - Apache Maven is a software project management and comprehension tool.
