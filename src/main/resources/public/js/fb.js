/* make the API call */
FB.api(
    "/{app-link-host-id}",
    function (response) {
      if (response && !response.error) {
        /* handle the result */
      }
    }
);