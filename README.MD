## Solution description

**Since:**
1. The idea was to build the best possible solution in the very limited time allotted
2. The requirements were very ambitious
3. The actor of the user story was a developer

**And:**
1. Assuming `the best possible solution` means the one with the most features

**The solution was built as follows:**
1. The api is /expanses/query=?, where query is an actual SQL query on the expanses dataset
2. The csv dataset was inserted in an in-memory database

## Running the solution

After running the Spring Boot application using the IDE or gradle, just run the script `execute.sh`  
The script will ask for the SQL select command (alias for the columns in the result are supported).  
The initial select keyword is not necessary and should not be added.  
The table name is `expanses`, and the column names match the csv file.  
The row number was mapped to a column named id.  

`curl` and `jq` are required, which are very basic tools every developer will find useful.  
It's also possible to make the request to the endpoint manually using Postman or other strategy.