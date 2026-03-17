API doc <3

# Create a .env file at the project root with
POSTGRES_DB=dbname
POSTGRES_USER=dbuser
POSTGRES_PASSWORD=dbpassword

# Create the database
At the first run turn ddl-auto: update to ddl-auto: validate to create the postgres database.
then turn it back to validate.