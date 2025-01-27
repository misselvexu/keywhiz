/*
 * This file is generated by jOOQ.
 */
package keywhiz.jooq;


import keywhiz.jooq.tables.Accessgrants;
import keywhiz.jooq.tables.Memberships;
import keywhiz.jooq.tables.SchemaVersion;
import keywhiz.jooq.tables.Secrets;
import keywhiz.jooq.tables.SecretsContent;

import org.jooq.Index;
import org.jooq.OrderField;
import org.jooq.impl.DSL;
import org.jooq.impl.Internal;


/**
 * A class modelling indexes of tables in keywhizdb_test.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Indexes {

    // -------------------------------------------------------------------------
    // INDEX definitions
    // -------------------------------------------------------------------------

    public static final Index ACCESSGRANTS_ACCESSGRANTS_SECRETID_IDX = Internal.createIndex(DSL.name("accessgrants_secretid_idx"), Accessgrants.ACCESSGRANTS, new OrderField[] { Accessgrants.ACCESSGRANTS.SECRETID }, false);
    public static final Index SECRETS_CONTENT_CREATEDAT_IDX = Internal.createIndex(DSL.name("createdat_idx"), SecretsContent.SECRETS_CONTENT, new OrderField[] { SecretsContent.SECRETS_CONTENT.CREATEDAT }, false);
    public static final Index MEMBERSHIPS_MEMBERSHIPS_GROUPID_IDX = Internal.createIndex(DSL.name("memberships_groupid_idx"), Memberships.MEMBERSHIPS, new OrderField[] { Memberships.MEMBERSHIPS.GROUPID }, false);
    public static final Index SECRETS_OWNER_IDX = Internal.createIndex(DSL.name("owner_idx"), Secrets.SECRETS, new OrderField[] { Secrets.SECRETS.OWNER }, false);
    public static final Index SCHEMA_VERSION_SCHEMA_VERSION_S_IDX = Internal.createIndex(DSL.name("schema_version_s_idx"), SchemaVersion.SCHEMA_VERSION, new OrderField[] { SchemaVersion.SCHEMA_VERSION.SUCCESS }, false);
    public static final Index SECRETS_CONTENT_SECRETID_IDX = Internal.createIndex(DSL.name("secretid_idx"), SecretsContent.SECRETS_CONTENT, new OrderField[] { SecretsContent.SECRETS_CONTENT.SECRETID }, false);
    public static final Index SECRETS_CONTENT_SECRETS_CONTENT_EXPIRY = Internal.createIndex(DSL.name("secrets_content_expiry"), SecretsContent.SECRETS_CONTENT, new OrderField[] { SecretsContent.SECRETS_CONTENT.EXPIRY }, false);
    public static final Index SECRETS_SECRETS_CURRENT_IDX = Internal.createIndex(DSL.name("secrets_current_idx"), Secrets.SECRETS, new OrderField[] { Secrets.SECRETS.CURRENT }, false);
}
