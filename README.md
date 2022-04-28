# knowledge-ngwarayi

To Run System

run jar in the target folder and access using the url :   http://localhost:3088/econet/area 


GET AREAS
curl --request GET \
  --url http://localhost:3088/econet/area \
  --header 'Content-Type: application/json' 
  
  
  
  GET AREA BY ID
  
  curl --request GET \
  --url http://localhost:3088/econet/area/findById/1 \
  --header 'Content-Type: application/json' \
  --data '	{
			"id": 1,
			"name": "CBD",
			"shops": [
				{
					"name": "First Street"
				}
			]
		}'
    
    
    SAVE SHOP IN AREA
    curl --request POST \
  --url http://localhost:3088/econet/shop/1/save \
  --header 'Content-Type: application/json' \
  --data '	{
			"name": "First_Street"
		}'
  
  
