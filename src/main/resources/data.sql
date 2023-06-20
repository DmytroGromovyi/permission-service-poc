insert into permission(name)
values ('Request.EDIT'),
       ('Request.READ'),
       ('Programs.EDIT'),
       ('Programs.READ');

insert into role(name)
values ('ADMIN_ROLE'),
       ('CUSTOM_ROLE'),
       ('USER_ROLE');

insert into role_permissions(role_id, permissions_id)
values (1, 1),
       (1, 2),
       (1, 3),
       (1, 4),
       (2, 2),
       (2, 3),
       (2, 4),
       (3, 2),
       (3, 4);

insert into user(name)
values ('DBrVPwGP5peOV5wdwJu4GazdiOg2'),
       ('DBrVPwGP5peOV5wdwJu4GazdiOg1');

insert into user_roles(roles_id, user_id)
values (1, 2),
       (3, 1);
