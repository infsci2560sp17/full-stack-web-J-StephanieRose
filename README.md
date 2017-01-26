# PenPal reLOADED

PenPal reLOADED is a new twist on an old concept. Unlike other pen pal approaches, we allow you to connect with people who have similar interests and tastes that allow you to expand your communication outside of your normal friend circle and learn more about the world around you. 

# Assignment 1.2 - Due 28 Jan 2017
Question 1.

Question 2.

Question 3.

Question 4.

Question 5. 

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

TODO : please provide a description of your landing page inluding a screen shot ![](https://.../image.JPG)

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
