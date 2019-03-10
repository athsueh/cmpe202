#Lab 4: Din Tai Fung Design Patterns


##Class Customer

The basic responsibility of a Customer object is to provide information about a party, as well as confirm/leave from the waitlist

Responsibilities:

-Know and provide the party’s: name, cell phone number, and party size to the LineHandler
-Confirm or Leave the line when prompted to respond when they reach the front of the line

Collaborators:

Step 1: LineHandler
Step 2: LineHandler


##Class LineHandler

The basic responsibility of a LineHandler object is to take in customer wait list requests, and manage the waitlist line. It must also communicate with the TableManager to know when a free table is available.

Responsibilities:

-Take in each of the party’s: name, cell phone number, and party size from applicants. 
-Know the customers in the waitlist line, prompting users to Confirm or Leave when they reach the top of the line. Receive the output, and:
A: if “confirm,” match customer with table and send reservation notice to TableManager.
B: if “leave,” remove customer from line, assess if next customer in line is suitable for then send a prompt again if so. If not, move to next person in line. (repeat until success)
-Receive notifications from the TableManager when a free table is available, specifically receiving the size of the free table

Collaborators:

Step 1: Customer
Step 2: Customer, TableManager
Step 3: TableManager


##Class TableManager

The basic responsibility of a TableManager object is to notify the LineHandler whenever a free table is available. It oversees all tables in the restaurant.

Responsibilities:

-Provide the LineHandler with free tables, specifically the size of a given free table when said table becomes ready.
-Receive responses from LineHandler to confirm reservations, if accepted from the provided table size. Notify the respective Table to make sure it changes state to Occupied.
-Know all tables and notifies the LineHandler each time a free table becomes ready.

Collaborators:

Step 1: LineHandler
Step 2: LineHandler, Table
Step 3: Table


##Class Table 

The basic responsibility of a Table object is to maintain information about a single table.

Responsibilities:

-Know and store information about a table’s size as well as state attribute: Ready or Occupied state 

Collaborators:

Step 1: TableManager



Pattern 1; Observer:

The TableManager acts as an observer, and is notified in changes in state of a given Table’s state. This allows it to trigger sending a message to the LineHandler, alerting it that there is a new ready table. When the state of a Table is changed, it notifies its dependent class, which is the LineHandler.

Pattern 2; State:

The class Table utilizes state, and each Table has a state of either “Ready” or “Occupied.” This allows a given Table object to notify the TableManager that it is Ready, and provides the size of the table as well. This behavior can only be performed when a Table is in “Ready” state, not in “Occupied” state. 
