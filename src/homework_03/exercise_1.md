# Requirements

## Identification and classification of requirements

1. The room booking service shall provide an overview of all available rooms in 
the selected university building. The user shall enter a date and time of their
interest. The overview shall mark the rooms that are occupied during the 
selected time.
&rarr; Functional Requirement

2. Room bookings shall be updated in real-time, that is: 
if a user is looking at the overview and another user at the same time books a
room, the overview shall be updated as fast as possible.
&rarr; Quality Requirement (Performance)

3. Room booking shall only be possible for logged-in users with respective
privileges.
&rarr; Quality Requirement (Security)

4. An initial version of the room booking service shall be ready after 5 months,
the first public version must be finished after 1 year.
&rarr; Project Requirement

5. For the initial version used for testing among a small testing group, a 
simple text-based approach is fine, but for the final product, a graphical 
representation is required so that users have an easier time using the system.
&rarr; Quality Requirement (Usability)

## Evaluation of the requirements' clarity and ideas for improvement

1. This requirement is relatively clear, but there is room for clarification, which could spare us a few feedback loops:
    - Define how the overview should be displayed (list, table, graphical map).
    - Specify how the user will enter the date and time (calendar widget, dropdown menu).
    - Indicate how occupied rooms will be marked (color, symbol).
 
2. This requirement is clear but could be improved with a quantitative definition of "as fast as possible" (e.g., update within X seconds).
  
3. This requirement is clear, but some details are missing:
    - Define what privileges are required.
    - Specify how authentication and authorization will be performed.

4. This requirement could benefit from milestone definitions:
    - Specify what must be included in the initial version.
    - Define which features are required for the public version.

5. This requirement is clear but could further specify the graphical representation and how the usability will be tested.
