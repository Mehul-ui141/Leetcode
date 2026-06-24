# Write your MySQL query statement below
Select e.name From Employee e join Employee f on e.id = f.managerId
Group by e.id Having count(f.id)>=5