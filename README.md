# PenPal reLOADED

PenPal reLOADED is a new twist on an old concept. Unlike other pen pal approaches, we allow you to connect with people who have similar interests and tastes that allow you to expand your communication outside of your normal friend circle and learn more about the world around you. 


## Assignment 1.5 & 1.6 - Due ?
Cleaning up my site...ran into some issues with the home.html, but the current version can be viewed here
[PenPal reLOADED Home](https://codenvy.io/40300_node16.codenvy.io/api/project/file/full-stack-web-J-StephanieRose/src/main/resources/templates/home.html?token=machinee1r3hh2fgn91v8tu85sygi6jd86ld2ca90la3cfmq8aa5kxvqk5tanop0yz4h09ond5q8aqjpbwawulu4v4u0nrjtnp4wudan548lblgm7nv1goui9aggs5z1wczb4j8)
The error I am receiving is below. 
![](https://pitt-my.sharepoint.com/personal/jsr67_pitt_edu/_layouts/15/guestaccess.aspx?docid=10f691e97ea3f4914b7e04c442f159072&authkey=AUBtkJzZyfSF5JJ9olKyBoI)
Error Received after running mvn package heroku -X
![](https://pitt-my.sharepoint.com/personal/jsr67_pitt_edu/_layouts/15/guestaccess.aspx?docid=15c0bedda4a8f4dc3bcb7a93876c0f258&authkey=AcrFtZpetlh4wyRWG2MgS30)
### CHANGELOG.md
[Change Log](https://github.com/infsci2560sp17/full-stack-web-J-StephanieRose/blob/master/CHANGELOG.md)


## Build status

[![Build Status](https://travis-ci.org/infsci2560sp17/full-stack-web-J-StephanieRose.svg?branch=master)


## Web Site

[PenPal reLOADED](https://full-stack-web-j-stephanierose.herokuapp.com/)

![](https://pitt-my.sharepoint.com/personal/jsr67_pitt_edu/_layouts/15/guestaccess.aspx?docid=12fe8d2bd2e724d609bb803e0ae8933b9&authkey=AXPv4NkNzacK0Jh0vBon1Tk)


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
