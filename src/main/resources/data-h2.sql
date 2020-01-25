INSERT INTO users (username, password, enabled)
VALUES ('barilska', 'barilska', true);

INSERT INTO users (username, password, enabled)
VALUES ('admin', 'admin', true);


INSERT INTO AUTHORITIES (USERNAME, AUTHORITY)
VALUES ('barilska', 'ROLE_USER');

INSERT INTO AUTHORITIES (USERNAME, AUTHORITY)
VALUES ('admin', 'ROLE_ADMIN');