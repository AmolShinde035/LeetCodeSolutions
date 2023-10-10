select w.id Id 
from weather q ,weather w
where w.temperature>q.temperature and adddate(q.recordDate,1) =  w.recordDate
