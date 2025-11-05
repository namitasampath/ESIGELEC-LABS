DROP TABLE reward
DROP TABLE contributor
DROP TABLE PROJECT
DROP TABLE contributes

CREATE TABLE reward(
rwd_id NUMBER(7),
rwd_type VARCHAR2(10) CONSTRAINT nn_rwd_type NOT NULL,
CONSTRAINT pk_rwd PRIMARY KEY(rwd_id)
);

CREATE TABLE contributor(
cnt_id NUMBER(7),
cnt_name VARCHAR2(25) ,
cnt_email VARCHAR2(25) CONSTRAINT un_cnt_email UNIQUE ,
cnt_rwd_id NUMBER(7),
CONSTRAINT pk_contr PRIMARY KEY(cnt_id),
CONSTRAINT fk_contr FOREIGN KEY (cnt_rwd_id) REFERENCES reward(rwd_id)
);


CREATE TABLE PROJECT(
prj_id NUMBER(7) ,
prj_name VARCHAR2(25) CONSTRAINT nn_prj_name NOT NULL ,
prj_goal NUMBER(6,2) CONSTRAINT ck_prj_goal CHECK (prj_goal BETWEEN 2000 AND 12000),
prj_deadline DATE,
CONSTRAINT pk_prj PRIMARY KEY(prj_id)
);


CREATE TABLE contributes(
cnt_id NUMBER(7),
prj_id NUMBER(7),
amount NUMBER(8,2) CONSTRAINT ck_amount CHECK (amount>0),
CONSTRAINT fk_contrbs_1 FOREIGN KEY (cnt_id) REFERENCES contributor(cnt_id),
CONSTRAINT fk_contrbs_2 FOREIGN KEY (prj_id) REFERENCES PROJECT(prj_id),
CONSTRAINT pk_contributes PRIMARY KEY (cnt_id, prj_id)
);


INSERT INTO PROJECT VALUES(556324, 'Hospital data management', 2500, TO_DATE('26-APR-2025', 'DD-MON-YYYY'));

//violation check
INSERT INTO PROJECT VALUES(556324, 'Volta Building Reconstruction Employees', 100, TO_DATE('07-JAN-2025', 'DD-MON-YYYY'));


//Violation not null
INSERT INTO reward(rwd_id) VALUES(34987);

INSERT INTO reward VALUES (3423,'Promotion');
INSERT INTO reward VALUES (3423,'Degrade');

//not null
INSERT INTO PROJECT(prj_id) VALUES (43655);

//amount above 0 ,CONSTRAINT VIOLATION
INSERT INTO contributor VALUES(34278, 'Milan', 'milan.ilic.2@web.de',3423 );
INSERT INTO contributes VALUES (54375,556324,-32);

