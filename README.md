API doc <3

# Create a .env file at the project root with
POSTGRES_DB=dbname
POSTGRES_USER=dbuser
POSTGRES_PASSWORD=dbpassword

# Create the database
At the first run in the application.yml turn ddl-auto: validate to ddl-auto: update to create the postgres database.
then turn it back to validate.
