CREATE USER scott
IDENTIFIED by tiger
DEFAULT TABLESPACE USERS
QUOTA UNLIMITED ON USERS;

GRANT CREATE SESSION TO scott;

GRANT ALL PRIVILEGES TO scott;