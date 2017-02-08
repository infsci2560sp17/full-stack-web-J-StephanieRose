# PenPal reLOADED

PenPal reLOADED is a new twist on an old concept. Unlike other pen pal approaches, we allow you to connect with people who have similar interests and tastes that allow you to expand your communication outside of your normal friend circle and learn more about the world around you. 


# Assignment 1.3 - Due 18 Feb 2017

   Full Stack Web Part 1 (initiated)
   ## 1) Create an Entity
   ## 2) Create a Respository
   ## 3) Create a RESTful web service and return JSON
   ## 4) Create a MVC Controller and implement GET & POST methods
   ## 5) Create a MVC Page and write it to your repository
   ## 6) Modify README.md to reflect summary changes
   ## 7) Modify CHANGELOG.md to reflect changes in more detail
   ## 8) Tag your git hub repository with v1.3 (as shown here https://pitt.box.com/s/xswcfyy73nexf5p7votgoqhvdmgpzaok)
### Build status

[![Build Status](https://travis-ci.org/infsci2560sp17/full-stack-web-J-StephanieRose.svg?branch=master)


## Web Site

https://penpal-reloaded.herokuapp.com/

## Key Features

* Online interconnectivity with possible offline capabilities (you shouldnt be constrained to only socializing online)
* You can sync your social media to your PenPal profile to find people you share common interests with
* PenPal University **coming soon** (allows you to collaborate on academic projects with other students in and outside of your university)

## Project Details

### Landing Page

       For the landing page, I plan on creating a logo with adobe creative suite.
     If feasible, I hope to have it animated. Additionally, the color scheme for my 
     site will be yellow, blue, black, and white. 
       

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

- [Spring Boot](https://projects.spring.io/spring-boot/) - Takes an opinionated view of building production-ready Spring applications.
- [Codenvy] (https://codenvy.io)
- [Maven](https://maven.apache.org/) - Apache Maven is a software project management and comprehension tool.
- [Heroku] (https://dashboard.heroku.com)