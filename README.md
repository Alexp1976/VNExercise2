# VNExercise2
This is a SpringBoot aplication so in order to test it proceed as follow:

1. After cloning the repository build the application with **mvn clean install**
2. Run the application with **mvn spring-boot:run**
3. To test the application enndpoint use Curl bellow

curl --location --request GET 'http://localhost:8081/vnexercise/countries' \
--header 'Content-Type: application/json' \
--header 'Cookie: jwt=eyJhbGciOiJSUzI1NiJ9.eyJzdWIiOiJhZ3JvdGlzLWZyb250IiwidmVyc29lcyI6eyJhY2MiOiJncmVlbiIsImNvcmUiOiJncmVlbiIsInJlYyI6ImdyZWVuIiwicmNhIjoiZ3JlZW4iLCJwcm9kIjoiZ3JlZW4iLCJjb3JlX3YyIjoiZ3JlZW4iLCJtY2JwIjoiZ3JlZW4iLCJkdmgiOiJncmVlbiIsInNlbSI6ImdyZWVuIn0sImV4cCI6MTY1MjU0NzM2NCwidGVuYW50IjoidGVzdGVzZW1lbnRlcyJ9.JoOeldAt_MnqrGJuSqcbdxly_w4FWRrP8H99cqVSRsIVrqodqiFOBHlHGJjLoWBLY8N3Y70VdpPjdwPO8u8OtrwykFGR5G5M-RtMl5LB4Xn-ah9mPxtE5cbzAJ9fLkDbpIDkiQTGQVMLGBue97Xv4UA62pgJx1uE5Rm6Qmbn1eCC7spEEcFmJmfyp3T__LYbQGuIPoQHE6spNVlIGsjrjvh5fdl-TFsNuh4lirJW1D9uoYzaHcvyHRFwY04EDN3XSLDIJxT2v7ocWQxz3eOQhlMfDGnWGXpviJUBy6kd6DtHMr9YTGxEyW-tQvdNSyjtb91jcO85sMkCUDpwhquE816jaKCkOVPW0kOwOosVDWSuy73R08sPEYlceY6N-_1xnNhqnqFYwWKvYTEDI3eGvKQs27epR4wTUM5dUHyoZLkC2olZ-rsPVhJO16Pe5mzhB8ZFf1d7z4W2SL3MlP_rxb4lik6RGQC8uUx2JzSaVGfeDHDXVaoZ0dHm1MfMy_27TsaFJPkogOCJLIVqyAerwSsUv7yHYBQsRmfe9HaIQkVLEGZXXgoife-4hd7Hz6BysvIkwQlhXTmOaKTiBi4HMarMdsYe9oVi2exqzLqEUFZnfRJoy1FjSoyh1yG7Zmb-ZYx6soqfyWECztMFv4xNkjxG7RBuB1ZPzD69UxvaVg8' \
--data-raw '[
    {
        "country": "US",
        "languages": [
            "en"
        ]
    },
    {
        "country": "BE",
        "languages": [
            "nl",
            "fr",
            "de"
        ]
    },
    {
        "country": "NL",
        "languages": [
            "nl",
            "fy"
        ]
    },
    {
        "country": "DE",
        "languages": [
            "de"
        ]
    },
    {
        "country": "ES",
        "languages": [
            "es"
        ]
    }
]'
