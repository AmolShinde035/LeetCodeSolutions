select p.product_name,sum(o.unit) unit
from Products p
join orders o
on p.product_id=o.product_id 
where order_date between '2020-02-01' and '2020-02-29' 
group by o.product_id
having sum(o.unit)>=100
