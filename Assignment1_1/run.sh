import requests

url = 'http://google.com'  # Replace with the URL of a web server you want to send the request to
message = 'Hello World!!'

response = requests.post(url, data=message)