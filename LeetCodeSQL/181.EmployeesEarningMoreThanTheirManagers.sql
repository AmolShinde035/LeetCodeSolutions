select e.name Employee
from Employee e,Employee d
where d.id=e.managerId and e.salary>d.salary
