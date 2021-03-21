create index IX_C145DFF9 on AMFUser_AMFUser (groupId);
create index IX_8EAC5F85 on AMFUser_AMFUser (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_5C610347 on AMFUser_AMFUser (uuid_[$COLUMN_LENGTH:75$], groupId);