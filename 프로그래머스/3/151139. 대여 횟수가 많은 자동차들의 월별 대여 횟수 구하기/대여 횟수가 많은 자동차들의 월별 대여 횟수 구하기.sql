-- 코드를 입력하세요
SELECT
  MONTH(start_date) AS month,
  car_id,
  COUNT(*) AS records
FROM
  CAR_RENTAL_COMPANY_RENTAL_HISTORY
WHERE
  start_date BETWEEN '2022-08-01' AND '2022-10-31'
  AND car_id IN (
    SELECT car_id
    FROM CAR_RENTAL_COMPANY_RENTAL_HISTORY
    WHERE start_date BETWEEN '2022-08-01' AND '2022-10-31'
    GROUP BY car_id
    HAVING COUNT(*) >= 5
  )
GROUP BY MONTH(start_date), car_id
ORDER BY MONTH(start_date) ASC, car_id DESC;