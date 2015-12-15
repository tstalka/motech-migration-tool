INSERT INTO "Type" VALUES ((SELECT "id" + 1 FROM "Type" ORDER BY "id" DESC LIMIT 1), 'mds.field.description.datetime', 'mds.field.datetime8', 'datetime', 'java.time.LocalDateTime');
INSERT INTO "Type" VALUES ((SELECT "id" + 1 FROM "Type" ORDER BY "id" DESC LIMIT 1), 'mds.field.description.localDate', 'mds.field.date8', 'localDate', 'java.time.LocalDate');

UPDATE "SEQUENCE_TABLE"
SET "NEXT_VAL" = (SELECT "id" + 1 FROM "Type" ORDER BY "id" DESC LIMIT 1)
WHERE "SEQUENCE_NAME" LIKE 'org.motechproject.mds.domain.Type';

ALTER TABLE "Entity" ADD COLUMN "bundleSymbolicName" varchar(255) DEFAULT NULL;