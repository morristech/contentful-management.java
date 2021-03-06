#!/usr/bin/env bash

output="$(basename $(echo $0) | sed 's#sh#json#g' | sed 's#^#../resources/#g')"

curl --verbose \
    -H 'Authorization: Bearer '$CMA_TOKEN  \
    'https://api.contentful.com/spaces/'$SPACE_ID'/api_keys/3iaYyIZdC1YyXaAmvm1oRE' \
    | sed 's/'${SPACE_ID}'/<space_id>/g' \
    | sed 's/'${CMA_TOKEN}'/<access_token>/g' \
    | sed 's/'${USER_ID}'/<user_id>/g' \
    | tee ${output}
