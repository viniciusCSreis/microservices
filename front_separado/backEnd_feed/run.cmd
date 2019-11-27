powershell -Command "(gc docker-compose-template.yml) -replace 'm2Home', '%USERPROFILE%\.m2\' | Out-File -encoding ASCII docker-compose.yml"
docker-compose up