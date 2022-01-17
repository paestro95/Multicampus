-- 연습문제 
show databases;
use employees;
show tables;
desc employees;

-- 1. EMPLOYEES테이블의 레코드 중 사원번호, 사원명, 입사일, 성별을 선택하라.
SELECT 
    emp_no, first_name, last_name, hire_date, gender
FROM
    employees;
    
    
-- 2. EMPLOYEES테이블의 레코드 중 사원번호, 사원명, 입사일을 선택하라. (단, 사원명을 오름차순으로 정렬하여 선택)
SELECT 
    emp_no, first_name, last_name, hire_date
FROM
    employees
ORDER BY first_name , last_name ASC;


-- 3. EMPLOYEES테이블의 레코드 중 6월, 12월에 입사한 사원의 사원번호, 사원명, 입사일을 선택하라.
SELECT 
    emp_no, first_name, last_name, hire_date
FROM
    employees
WHERE
    hire_date LIKE '_____06%'
        OR hire_date LIKE '_____12%';
        
        
-- 4. EMPLOYEES테이블의 레코드 중 사원명에 ‘A’로 시작하고 생일이 1950년~1959년 사이인 사원을 나이가 많은 순으로 선택하라. 
SELECT 
    *
FROM
    employees
WHERE
    first_name LIKE 'A%'
        AND birth_date BETWEEN '1950-01-01' AND '1959-12-31'
ORDER BY birth_date ASC;
    
	
--  5. EMPLOYEES테이블의 레코드 중 1960년도에 태어난 남자사원을 선택하라. 
SELECT 
    *
FROM
    employees
WHERE
    birth_date LIKE '1960%' AND gender = 'm';


--  6. EMPLOYEES테이블의 사원 중 1월에 태어난 여자 사원을 이름을 오름차순으로 선택하라. 
SELECT 
    *
FROM 
    employees
WHERE
    birth_date LIKE '_____01%'
        AND gender = 'f'
ORDER BY first_name, last_name ASC;


--  7. EMPLOYEES테이블의 사원 입사일이 1990-01-01이후인 사원과 이름에 B가 포함된 사원을 입사일 기준 내림차순으로 정렬하여 선택하라. 
SELECT 
    *
FROM
    employees
WHERE
    hire_date >= 1990 - 01 - 01
        or first_name LIKE '%B%'
        and last_name LIKE '%B%'
ORDER BY hire_date DESC; 


--  8. 현재 데이터베이스의 테이블 목록을 확인하는 쿼리문을 작성하라.
show tables;


--  9. EMPLOYEES테이블의 사원 중 사원번호, 이름, 생년월일, 입사일을 오름차순, 사원번호는 내림차순으로 정렬하여 선택하라
SELECT 
    emp_no, first_name, last_name, birth_date, hire_date
FROM
    employees
ORDER BY first_name , last_name , birth_date , hire_date asc, emp_no DESC;


--  10. EMPLOYEES테이블의 구조를 확인하는 쿼리문을 작성하라.
desc employees;


--  11. 현재 계정의 데이터베이스의 목록을 확인하는 쿼리문을 작성하라.
show databases;
 