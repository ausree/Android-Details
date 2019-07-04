package io.realm;


import android.annotation.TargetApi;
import android.os.Build;
import android.util.JsonReader;
import android.util.JsonToken;
import io.realm.ImportFlag;
import io.realm.ProxyUtils;
import io.realm.exceptions.RealmMigrationNeededException;
import io.realm.internal.ColumnInfo;
import io.realm.internal.OsList;
import io.realm.internal.OsObject;
import io.realm.internal.OsObjectSchemaInfo;
import io.realm.internal.OsSchemaInfo;
import io.realm.internal.Property;
import io.realm.internal.RealmObjectProxy;
import io.realm.internal.Row;
import io.realm.internal.Table;
import io.realm.internal.android.JsonUtils;
import io.realm.internal.objectstore.OsObjectBuilder;
import io.realm.log.RealmLog;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@SuppressWarnings("all")
public class com_example_realmrecyclerview_MyPersonRealmProxy extends com.example.realmrecyclerview.MyPerson
    implements RealmObjectProxy, com_example_realmrecyclerview_MyPersonRealmProxyInterface {

    static final class MyPersonColumnInfo extends ColumnInfo {
        long maxColumnIndexValue;
        long idIndex;
        long nameIndex;
        long deptIndex;
        long phoneIndex;
        long rollIndex;
        long genderIndex;

        MyPersonColumnInfo(OsSchemaInfo schemaInfo) {
            super(6);
            OsObjectSchemaInfo objectSchemaInfo = schemaInfo.getObjectSchemaInfo("MyPerson");
            this.idIndex = addColumnDetails("id", "id", objectSchemaInfo);
            this.nameIndex = addColumnDetails("name", "name", objectSchemaInfo);
            this.deptIndex = addColumnDetails("dept", "dept", objectSchemaInfo);
            this.phoneIndex = addColumnDetails("phone", "phone", objectSchemaInfo);
            this.rollIndex = addColumnDetails("roll", "roll", objectSchemaInfo);
            this.genderIndex = addColumnDetails("gender", "gender", objectSchemaInfo);
            this.maxColumnIndexValue = objectSchemaInfo.getMaxColumnIndex();
        }

        MyPersonColumnInfo(ColumnInfo src, boolean mutable) {
            super(src, mutable);
            copy(src, this);
        }

        @Override
        protected final ColumnInfo copy(boolean mutable) {
            return new MyPersonColumnInfo(this, mutable);
        }

        @Override
        protected final void copy(ColumnInfo rawSrc, ColumnInfo rawDst) {
            final MyPersonColumnInfo src = (MyPersonColumnInfo) rawSrc;
            final MyPersonColumnInfo dst = (MyPersonColumnInfo) rawDst;
            dst.idIndex = src.idIndex;
            dst.nameIndex = src.nameIndex;
            dst.deptIndex = src.deptIndex;
            dst.phoneIndex = src.phoneIndex;
            dst.rollIndex = src.rollIndex;
            dst.genderIndex = src.genderIndex;
            dst.maxColumnIndexValue = src.maxColumnIndexValue;
        }
    }

    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();

    private MyPersonColumnInfo columnInfo;
    private ProxyState<com.example.realmrecyclerview.MyPerson> proxyState;

    com_example_realmrecyclerview_MyPersonRealmProxy() {
        proxyState.setConstructionFinished();
    }

    @Override
    public void realm$injectObjectContext() {
        if (this.proxyState != null) {
            return;
        }
        final BaseRealm.RealmObjectContext context = BaseRealm.objectContext.get();
        this.columnInfo = (MyPersonColumnInfo) context.getColumnInfo();
        this.proxyState = new ProxyState<com.example.realmrecyclerview.MyPerson>(this);
        proxyState.setRealm$realm(context.getRealm());
        proxyState.setRow$realm(context.getRow());
        proxyState.setAcceptDefaultValue$realm(context.getAcceptDefaultValue());
        proxyState.setExcludeFields$realm(context.getExcludeFields());
    }

    @Override
    @SuppressWarnings("cast")
    public long realmGet$id() {
        proxyState.getRealm$realm().checkIfValid();
        return (long) proxyState.getRow$realm().getLong(columnInfo.idIndex);
    }

    @Override
    public void realmSet$id(long value) {
        if (proxyState.isUnderConstruction()) {
            // default value of the primary key is always ignored.
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        throw new io.realm.exceptions.RealmException("Primary key field 'id' cannot be changed after object was created.");
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$name() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.nameIndex);
    }

    @Override
    public void realmSet$name(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.nameIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.nameIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.nameIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.nameIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$dept() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.deptIndex);
    }

    @Override
    public void realmSet$dept(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.deptIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.deptIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.deptIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.deptIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$phone() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.phoneIndex);
    }

    @Override
    public void realmSet$phone(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.phoneIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.phoneIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.phoneIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.phoneIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public int realmGet$roll() {
        proxyState.getRealm$realm().checkIfValid();
        return (int) proxyState.getRow$realm().getLong(columnInfo.rollIndex);
    }

    @Override
    public void realmSet$roll(int value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setLong(columnInfo.rollIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setLong(columnInfo.rollIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$gender() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.genderIndex);
    }

    @Override
    public void realmSet$gender(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.genderIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.genderIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.genderIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.genderIndex, value);
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder("MyPerson", 6, 0);
        builder.addPersistedProperty("id", RealmFieldType.INTEGER, Property.PRIMARY_KEY, Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("name", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("dept", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("phone", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("roll", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("gender", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static MyPersonColumnInfo createColumnInfo(OsSchemaInfo schemaInfo) {
        return new MyPersonColumnInfo(schemaInfo);
    }

    public static String getSimpleClassName() {
        return "MyPerson";
    }

    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "MyPerson";
    }

    @SuppressWarnings("cast")
    public static com.example.realmrecyclerview.MyPerson createOrUpdateUsingJsonObject(Realm realm, JSONObject json, boolean update)
        throws JSONException {
        final List<String> excludeFields = Collections.<String> emptyList();
        com.example.realmrecyclerview.MyPerson obj = null;
        if (update) {
            Table table = realm.getTable(com.example.realmrecyclerview.MyPerson.class);
            MyPersonColumnInfo columnInfo = (MyPersonColumnInfo) realm.getSchema().getColumnInfo(com.example.realmrecyclerview.MyPerson.class);
            long pkColumnIndex = columnInfo.idIndex;
            long rowIndex = Table.NO_MATCH;
            if (!json.isNull("id")) {
                rowIndex = table.findFirstLong(pkColumnIndex, json.getLong("id"));
            }
            if (rowIndex != Table.NO_MATCH) {
                final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
                try {
                    objectContext.set(realm, table.getUncheckedRow(rowIndex), realm.getSchema().getColumnInfo(com.example.realmrecyclerview.MyPerson.class), false, Collections.<String> emptyList());
                    obj = new io.realm.com_example_realmrecyclerview_MyPersonRealmProxy();
                } finally {
                    objectContext.clear();
                }
            }
        }
        if (obj == null) {
            if (json.has("id")) {
                if (json.isNull("id")) {
                    obj = (io.realm.com_example_realmrecyclerview_MyPersonRealmProxy) realm.createObjectInternal(com.example.realmrecyclerview.MyPerson.class, null, true, excludeFields);
                } else {
                    obj = (io.realm.com_example_realmrecyclerview_MyPersonRealmProxy) realm.createObjectInternal(com.example.realmrecyclerview.MyPerson.class, json.getLong("id"), true, excludeFields);
                }
            } else {
                throw new IllegalArgumentException("JSON object doesn't have the primary key field 'id'.");
            }
        }

        final com_example_realmrecyclerview_MyPersonRealmProxyInterface objProxy = (com_example_realmrecyclerview_MyPersonRealmProxyInterface) obj;
        if (json.has("name")) {
            if (json.isNull("name")) {
                objProxy.realmSet$name(null);
            } else {
                objProxy.realmSet$name((String) json.getString("name"));
            }
        }
        if (json.has("dept")) {
            if (json.isNull("dept")) {
                objProxy.realmSet$dept(null);
            } else {
                objProxy.realmSet$dept((String) json.getString("dept"));
            }
        }
        if (json.has("phone")) {
            if (json.isNull("phone")) {
                objProxy.realmSet$phone(null);
            } else {
                objProxy.realmSet$phone((String) json.getString("phone"));
            }
        }
        if (json.has("roll")) {
            if (json.isNull("roll")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'roll' to null.");
            } else {
                objProxy.realmSet$roll((int) json.getInt("roll"));
            }
        }
        if (json.has("gender")) {
            if (json.isNull("gender")) {
                objProxy.realmSet$gender(null);
            } else {
                objProxy.realmSet$gender((String) json.getString("gender"));
            }
        }
        return obj;
    }

    @SuppressWarnings("cast")
    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public static com.example.realmrecyclerview.MyPerson createUsingJsonStream(Realm realm, JsonReader reader)
        throws IOException {
        boolean jsonHasPrimaryKey = false;
        final com.example.realmrecyclerview.MyPerson obj = new com.example.realmrecyclerview.MyPerson();
        final com_example_realmrecyclerview_MyPersonRealmProxyInterface objProxy = (com_example_realmrecyclerview_MyPersonRealmProxyInterface) obj;
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (false) {
            } else if (name.equals("id")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$id((long) reader.nextLong());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'id' to null.");
                }
                jsonHasPrimaryKey = true;
            } else if (name.equals("name")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$name((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$name(null);
                }
            } else if (name.equals("dept")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$dept((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$dept(null);
                }
            } else if (name.equals("phone")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$phone((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$phone(null);
                }
            } else if (name.equals("roll")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$roll((int) reader.nextInt());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'roll' to null.");
                }
            } else if (name.equals("gender")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$gender((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$gender(null);
                }
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        if (!jsonHasPrimaryKey) {
            throw new IllegalArgumentException("JSON object doesn't have the primary key field 'id'.");
        }
        return realm.copyToRealm(obj);
    }

    private static com_example_realmrecyclerview_MyPersonRealmProxy newProxyInstance(BaseRealm realm, Row row) {
        // Ignore default values to avoid creating unexpected objects from RealmModel/RealmList fields
        final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
        objectContext.set(realm, row, realm.getSchema().getColumnInfo(com.example.realmrecyclerview.MyPerson.class), false, Collections.<String>emptyList());
        io.realm.com_example_realmrecyclerview_MyPersonRealmProxy obj = new io.realm.com_example_realmrecyclerview_MyPersonRealmProxy();
        objectContext.clear();
        return obj;
    }

    public static com.example.realmrecyclerview.MyPerson copyOrUpdate(Realm realm, MyPersonColumnInfo columnInfo, com.example.realmrecyclerview.MyPerson object, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null) {
            final BaseRealm otherRealm = ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm();
            if (otherRealm.threadId != realm.threadId) {
                throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
            }
            if (otherRealm.getPath().equals(realm.getPath())) {
                return object;
            }
        }
        final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
        RealmObjectProxy cachedRealmObject = cache.get(object);
        if (cachedRealmObject != null) {
            return (com.example.realmrecyclerview.MyPerson) cachedRealmObject;
        }

        com.example.realmrecyclerview.MyPerson realmObject = null;
        boolean canUpdate = update;
        if (canUpdate) {
            Table table = realm.getTable(com.example.realmrecyclerview.MyPerson.class);
            long pkColumnIndex = columnInfo.idIndex;
            long rowIndex = table.findFirstLong(pkColumnIndex, ((com_example_realmrecyclerview_MyPersonRealmProxyInterface) object).realmGet$id());
            if (rowIndex == Table.NO_MATCH) {
                canUpdate = false;
            } else {
                try {
                    objectContext.set(realm, table.getUncheckedRow(rowIndex), columnInfo, false, Collections.<String> emptyList());
                    realmObject = new io.realm.com_example_realmrecyclerview_MyPersonRealmProxy();
                    cache.put(object, (RealmObjectProxy) realmObject);
                } finally {
                    objectContext.clear();
                }
            }
        }

        return (canUpdate) ? update(realm, columnInfo, realmObject, object, cache, flags) : copy(realm, columnInfo, object, update, cache, flags);
    }

    public static com.example.realmrecyclerview.MyPerson copy(Realm realm, MyPersonColumnInfo columnInfo, com.example.realmrecyclerview.MyPerson newObject, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
        RealmObjectProxy cachedRealmObject = cache.get(newObject);
        if (cachedRealmObject != null) {
            return (com.example.realmrecyclerview.MyPerson) cachedRealmObject;
        }

        com_example_realmrecyclerview_MyPersonRealmProxyInterface realmObjectSource = (com_example_realmrecyclerview_MyPersonRealmProxyInterface) newObject;

        Table table = realm.getTable(com.example.realmrecyclerview.MyPerson.class);
        OsObjectBuilder builder = new OsObjectBuilder(table, columnInfo.maxColumnIndexValue, flags);

        // Add all non-"object reference" fields
        builder.addInteger(columnInfo.idIndex, realmObjectSource.realmGet$id());
        builder.addString(columnInfo.nameIndex, realmObjectSource.realmGet$name());
        builder.addString(columnInfo.deptIndex, realmObjectSource.realmGet$dept());
        builder.addString(columnInfo.phoneIndex, realmObjectSource.realmGet$phone());
        builder.addInteger(columnInfo.rollIndex, realmObjectSource.realmGet$roll());
        builder.addString(columnInfo.genderIndex, realmObjectSource.realmGet$gender());

        // Create the underlying object and cache it before setting any object/objectlist references
        // This will allow us to break any circular dependencies by using the object cache.
        Row row = builder.createNewObject();
        io.realm.com_example_realmrecyclerview_MyPersonRealmProxy realmObjectCopy = newProxyInstance(realm, row);
        cache.put(newObject, realmObjectCopy);

        return realmObjectCopy;
    }

    public static long insert(Realm realm, com.example.realmrecyclerview.MyPerson object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(com.example.realmrecyclerview.MyPerson.class);
        long tableNativePtr = table.getNativePtr();
        MyPersonColumnInfo columnInfo = (MyPersonColumnInfo) realm.getSchema().getColumnInfo(com.example.realmrecyclerview.MyPerson.class);
        long pkColumnIndex = columnInfo.idIndex;
        long rowIndex = Table.NO_MATCH;
        Object primaryKeyValue = ((com_example_realmrecyclerview_MyPersonRealmProxyInterface) object).realmGet$id();
        if (primaryKeyValue != null) {
            rowIndex = Table.nativeFindFirstInt(tableNativePtr, pkColumnIndex, ((com_example_realmrecyclerview_MyPersonRealmProxyInterface) object).realmGet$id());
        }
        if (rowIndex == Table.NO_MATCH) {
            rowIndex = OsObject.createRowWithPrimaryKey(table, pkColumnIndex, ((com_example_realmrecyclerview_MyPersonRealmProxyInterface) object).realmGet$id());
        } else {
            Table.throwDuplicatePrimaryKeyException(primaryKeyValue);
        }
        cache.put(object, rowIndex);
        String realmGet$name = ((com_example_realmrecyclerview_MyPersonRealmProxyInterface) object).realmGet$name();
        if (realmGet$name != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.nameIndex, rowIndex, realmGet$name, false);
        }
        String realmGet$dept = ((com_example_realmrecyclerview_MyPersonRealmProxyInterface) object).realmGet$dept();
        if (realmGet$dept != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.deptIndex, rowIndex, realmGet$dept, false);
        }
        String realmGet$phone = ((com_example_realmrecyclerview_MyPersonRealmProxyInterface) object).realmGet$phone();
        if (realmGet$phone != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phoneIndex, rowIndex, realmGet$phone, false);
        }
        Table.nativeSetLong(tableNativePtr, columnInfo.rollIndex, rowIndex, ((com_example_realmrecyclerview_MyPersonRealmProxyInterface) object).realmGet$roll(), false);
        String realmGet$gender = ((com_example_realmrecyclerview_MyPersonRealmProxyInterface) object).realmGet$gender();
        if (realmGet$gender != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.genderIndex, rowIndex, realmGet$gender, false);
        }
        return rowIndex;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.example.realmrecyclerview.MyPerson.class);
        long tableNativePtr = table.getNativePtr();
        MyPersonColumnInfo columnInfo = (MyPersonColumnInfo) realm.getSchema().getColumnInfo(com.example.realmrecyclerview.MyPerson.class);
        long pkColumnIndex = columnInfo.idIndex;
        com.example.realmrecyclerview.MyPerson object = null;
        while (objects.hasNext()) {
            object = (com.example.realmrecyclerview.MyPerson) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex());
                continue;
            }
            long rowIndex = Table.NO_MATCH;
            Object primaryKeyValue = ((com_example_realmrecyclerview_MyPersonRealmProxyInterface) object).realmGet$id();
            if (primaryKeyValue != null) {
                rowIndex = Table.nativeFindFirstInt(tableNativePtr, pkColumnIndex, ((com_example_realmrecyclerview_MyPersonRealmProxyInterface) object).realmGet$id());
            }
            if (rowIndex == Table.NO_MATCH) {
                rowIndex = OsObject.createRowWithPrimaryKey(table, pkColumnIndex, ((com_example_realmrecyclerview_MyPersonRealmProxyInterface) object).realmGet$id());
            } else {
                Table.throwDuplicatePrimaryKeyException(primaryKeyValue);
            }
            cache.put(object, rowIndex);
            String realmGet$name = ((com_example_realmrecyclerview_MyPersonRealmProxyInterface) object).realmGet$name();
            if (realmGet$name != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.nameIndex, rowIndex, realmGet$name, false);
            }
            String realmGet$dept = ((com_example_realmrecyclerview_MyPersonRealmProxyInterface) object).realmGet$dept();
            if (realmGet$dept != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.deptIndex, rowIndex, realmGet$dept, false);
            }
            String realmGet$phone = ((com_example_realmrecyclerview_MyPersonRealmProxyInterface) object).realmGet$phone();
            if (realmGet$phone != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.phoneIndex, rowIndex, realmGet$phone, false);
            }
            Table.nativeSetLong(tableNativePtr, columnInfo.rollIndex, rowIndex, ((com_example_realmrecyclerview_MyPersonRealmProxyInterface) object).realmGet$roll(), false);
            String realmGet$gender = ((com_example_realmrecyclerview_MyPersonRealmProxyInterface) object).realmGet$gender();
            if (realmGet$gender != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.genderIndex, rowIndex, realmGet$gender, false);
            }
        }
    }

    public static long insertOrUpdate(Realm realm, com.example.realmrecyclerview.MyPerson object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(com.example.realmrecyclerview.MyPerson.class);
        long tableNativePtr = table.getNativePtr();
        MyPersonColumnInfo columnInfo = (MyPersonColumnInfo) realm.getSchema().getColumnInfo(com.example.realmrecyclerview.MyPerson.class);
        long pkColumnIndex = columnInfo.idIndex;
        long rowIndex = Table.NO_MATCH;
        Object primaryKeyValue = ((com_example_realmrecyclerview_MyPersonRealmProxyInterface) object).realmGet$id();
        if (primaryKeyValue != null) {
            rowIndex = Table.nativeFindFirstInt(tableNativePtr, pkColumnIndex, ((com_example_realmrecyclerview_MyPersonRealmProxyInterface) object).realmGet$id());
        }
        if (rowIndex == Table.NO_MATCH) {
            rowIndex = OsObject.createRowWithPrimaryKey(table, pkColumnIndex, ((com_example_realmrecyclerview_MyPersonRealmProxyInterface) object).realmGet$id());
        }
        cache.put(object, rowIndex);
        String realmGet$name = ((com_example_realmrecyclerview_MyPersonRealmProxyInterface) object).realmGet$name();
        if (realmGet$name != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.nameIndex, rowIndex, realmGet$name, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.nameIndex, rowIndex, false);
        }
        String realmGet$dept = ((com_example_realmrecyclerview_MyPersonRealmProxyInterface) object).realmGet$dept();
        if (realmGet$dept != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.deptIndex, rowIndex, realmGet$dept, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.deptIndex, rowIndex, false);
        }
        String realmGet$phone = ((com_example_realmrecyclerview_MyPersonRealmProxyInterface) object).realmGet$phone();
        if (realmGet$phone != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phoneIndex, rowIndex, realmGet$phone, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.phoneIndex, rowIndex, false);
        }
        Table.nativeSetLong(tableNativePtr, columnInfo.rollIndex, rowIndex, ((com_example_realmrecyclerview_MyPersonRealmProxyInterface) object).realmGet$roll(), false);
        String realmGet$gender = ((com_example_realmrecyclerview_MyPersonRealmProxyInterface) object).realmGet$gender();
        if (realmGet$gender != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.genderIndex, rowIndex, realmGet$gender, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.genderIndex, rowIndex, false);
        }
        return rowIndex;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.example.realmrecyclerview.MyPerson.class);
        long tableNativePtr = table.getNativePtr();
        MyPersonColumnInfo columnInfo = (MyPersonColumnInfo) realm.getSchema().getColumnInfo(com.example.realmrecyclerview.MyPerson.class);
        long pkColumnIndex = columnInfo.idIndex;
        com.example.realmrecyclerview.MyPerson object = null;
        while (objects.hasNext()) {
            object = (com.example.realmrecyclerview.MyPerson) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex());
                continue;
            }
            long rowIndex = Table.NO_MATCH;
            Object primaryKeyValue = ((com_example_realmrecyclerview_MyPersonRealmProxyInterface) object).realmGet$id();
            if (primaryKeyValue != null) {
                rowIndex = Table.nativeFindFirstInt(tableNativePtr, pkColumnIndex, ((com_example_realmrecyclerview_MyPersonRealmProxyInterface) object).realmGet$id());
            }
            if (rowIndex == Table.NO_MATCH) {
                rowIndex = OsObject.createRowWithPrimaryKey(table, pkColumnIndex, ((com_example_realmrecyclerview_MyPersonRealmProxyInterface) object).realmGet$id());
            }
            cache.put(object, rowIndex);
            String realmGet$name = ((com_example_realmrecyclerview_MyPersonRealmProxyInterface) object).realmGet$name();
            if (realmGet$name != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.nameIndex, rowIndex, realmGet$name, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.nameIndex, rowIndex, false);
            }
            String realmGet$dept = ((com_example_realmrecyclerview_MyPersonRealmProxyInterface) object).realmGet$dept();
            if (realmGet$dept != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.deptIndex, rowIndex, realmGet$dept, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.deptIndex, rowIndex, false);
            }
            String realmGet$phone = ((com_example_realmrecyclerview_MyPersonRealmProxyInterface) object).realmGet$phone();
            if (realmGet$phone != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.phoneIndex, rowIndex, realmGet$phone, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.phoneIndex, rowIndex, false);
            }
            Table.nativeSetLong(tableNativePtr, columnInfo.rollIndex, rowIndex, ((com_example_realmrecyclerview_MyPersonRealmProxyInterface) object).realmGet$roll(), false);
            String realmGet$gender = ((com_example_realmrecyclerview_MyPersonRealmProxyInterface) object).realmGet$gender();
            if (realmGet$gender != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.genderIndex, rowIndex, realmGet$gender, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.genderIndex, rowIndex, false);
            }
        }
    }

    public static com.example.realmrecyclerview.MyPerson createDetachedCopy(com.example.realmrecyclerview.MyPerson realmObject, int currentDepth, int maxDepth, Map<RealmModel, CacheData<RealmModel>> cache) {
        if (currentDepth > maxDepth || realmObject == null) {
            return null;
        }
        CacheData<RealmModel> cachedObject = cache.get(realmObject);
        com.example.realmrecyclerview.MyPerson unmanagedObject;
        if (cachedObject == null) {
            unmanagedObject = new com.example.realmrecyclerview.MyPerson();
            cache.put(realmObject, new RealmObjectProxy.CacheData<RealmModel>(currentDepth, unmanagedObject));
        } else {
            // Reuse cached object or recreate it because it was encountered at a lower depth.
            if (currentDepth >= cachedObject.minDepth) {
                return (com.example.realmrecyclerview.MyPerson) cachedObject.object;
            }
            unmanagedObject = (com.example.realmrecyclerview.MyPerson) cachedObject.object;
            cachedObject.minDepth = currentDepth;
        }
        com_example_realmrecyclerview_MyPersonRealmProxyInterface unmanagedCopy = (com_example_realmrecyclerview_MyPersonRealmProxyInterface) unmanagedObject;
        com_example_realmrecyclerview_MyPersonRealmProxyInterface realmSource = (com_example_realmrecyclerview_MyPersonRealmProxyInterface) realmObject;
        unmanagedCopy.realmSet$id(realmSource.realmGet$id());
        unmanagedCopy.realmSet$name(realmSource.realmGet$name());
        unmanagedCopy.realmSet$dept(realmSource.realmGet$dept());
        unmanagedCopy.realmSet$phone(realmSource.realmGet$phone());
        unmanagedCopy.realmSet$roll(realmSource.realmGet$roll());
        unmanagedCopy.realmSet$gender(realmSource.realmGet$gender());

        return unmanagedObject;
    }

    static com.example.realmrecyclerview.MyPerson update(Realm realm, MyPersonColumnInfo columnInfo, com.example.realmrecyclerview.MyPerson realmObject, com.example.realmrecyclerview.MyPerson newObject, Map<RealmModel, RealmObjectProxy> cache, Set<ImportFlag> flags) {
        com_example_realmrecyclerview_MyPersonRealmProxyInterface realmObjectTarget = (com_example_realmrecyclerview_MyPersonRealmProxyInterface) realmObject;
        com_example_realmrecyclerview_MyPersonRealmProxyInterface realmObjectSource = (com_example_realmrecyclerview_MyPersonRealmProxyInterface) newObject;
        Table table = realm.getTable(com.example.realmrecyclerview.MyPerson.class);
        OsObjectBuilder builder = new OsObjectBuilder(table, columnInfo.maxColumnIndexValue, flags);
        builder.addInteger(columnInfo.idIndex, realmObjectSource.realmGet$id());
        builder.addString(columnInfo.nameIndex, realmObjectSource.realmGet$name());
        builder.addString(columnInfo.deptIndex, realmObjectSource.realmGet$dept());
        builder.addString(columnInfo.phoneIndex, realmObjectSource.realmGet$phone());
        builder.addInteger(columnInfo.rollIndex, realmObjectSource.realmGet$roll());
        builder.addString(columnInfo.genderIndex, realmObjectSource.realmGet$gender());

        builder.updateExistingObject();
        return realmObject;
    }

    @Override
    @SuppressWarnings("ArrayToString")
    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder stringBuilder = new StringBuilder("MyPerson = proxy[");
        stringBuilder.append("{id:");
        stringBuilder.append(realmGet$id());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{name:");
        stringBuilder.append(realmGet$name() != null ? realmGet$name() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{dept:");
        stringBuilder.append(realmGet$dept() != null ? realmGet$dept() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{phone:");
        stringBuilder.append(realmGet$phone() != null ? realmGet$phone() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{roll:");
        stringBuilder.append(realmGet$roll());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{gender:");
        stringBuilder.append(realmGet$gender() != null ? realmGet$gender() : "null");
        stringBuilder.append("}");
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    @Override
    public ProxyState<?> realmGet$proxyState() {
        return proxyState;
    }

    @Override
    public int hashCode() {
        String realmName = proxyState.getRealm$realm().getPath();
        String tableName = proxyState.getRow$realm().getTable().getName();
        long rowIndex = proxyState.getRow$realm().getIndex();

        int result = 17;
        result = 31 * result + ((realmName != null) ? realmName.hashCode() : 0);
        result = 31 * result + ((tableName != null) ? tableName.hashCode() : 0);
        result = 31 * result + (int) (rowIndex ^ (rowIndex >>> 32));
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        com_example_realmrecyclerview_MyPersonRealmProxy aMyPerson = (com_example_realmrecyclerview_MyPersonRealmProxy)o;

        String path = proxyState.getRealm$realm().getPath();
        String otherPath = aMyPerson.proxyState.getRealm$realm().getPath();
        if (path != null ? !path.equals(otherPath) : otherPath != null) return false;

        String tableName = proxyState.getRow$realm().getTable().getName();
        String otherTableName = aMyPerson.proxyState.getRow$realm().getTable().getName();
        if (tableName != null ? !tableName.equals(otherTableName) : otherTableName != null) return false;

        if (proxyState.getRow$realm().getIndex() != aMyPerson.proxyState.getRow$realm().getIndex()) return false;

        return true;
    }
}
