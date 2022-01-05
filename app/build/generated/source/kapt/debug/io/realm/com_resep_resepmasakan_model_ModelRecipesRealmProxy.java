package io.realm;


import android.annotation.TargetApi;
import android.os.Build;
import android.util.JsonReader;
import android.util.JsonToken;
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
import io.realm.log.RealmLog;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@SuppressWarnings("all")
public class com_resep_resepmasakan_model_ModelRecipesRealmProxy extends com.resep.resepmasakan.model.ModelRecipes
    implements RealmObjectProxy, com_resep_resepmasakan_model_ModelRecipesRealmProxyInterface {

    static final class ModelRecipesColumnInfo extends ColumnInfo {
        long strTitleResepIndex;
        long strThumbnailIndex;
        long strKeyResepIndex;
        long strTimesIndex;
        long strPortionIndex;
        long strDificultyIndex;

        ModelRecipesColumnInfo(OsSchemaInfo schemaInfo) {
            super(6);
            OsObjectSchemaInfo objectSchemaInfo = schemaInfo.getObjectSchemaInfo("ModelRecipes");
            this.strTitleResepIndex = addColumnDetails("strTitleResep", "strTitleResep", objectSchemaInfo);
            this.strThumbnailIndex = addColumnDetails("strThumbnail", "strThumbnail", objectSchemaInfo);
            this.strKeyResepIndex = addColumnDetails("strKeyResep", "strKeyResep", objectSchemaInfo);
            this.strTimesIndex = addColumnDetails("strTimes", "strTimes", objectSchemaInfo);
            this.strPortionIndex = addColumnDetails("strPortion", "strPortion", objectSchemaInfo);
            this.strDificultyIndex = addColumnDetails("strDificulty", "strDificulty", objectSchemaInfo);
        }

        ModelRecipesColumnInfo(ColumnInfo src, boolean mutable) {
            super(src, mutable);
            copy(src, this);
        }

        @Override
        protected final ColumnInfo copy(boolean mutable) {
            return new ModelRecipesColumnInfo(this, mutable);
        }

        @Override
        protected final void copy(ColumnInfo rawSrc, ColumnInfo rawDst) {
            final ModelRecipesColumnInfo src = (ModelRecipesColumnInfo) rawSrc;
            final ModelRecipesColumnInfo dst = (ModelRecipesColumnInfo) rawDst;
            dst.strTitleResepIndex = src.strTitleResepIndex;
            dst.strThumbnailIndex = src.strThumbnailIndex;
            dst.strKeyResepIndex = src.strKeyResepIndex;
            dst.strTimesIndex = src.strTimesIndex;
            dst.strPortionIndex = src.strPortionIndex;
            dst.strDificultyIndex = src.strDificultyIndex;
        }
    }

    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();

    private ModelRecipesColumnInfo columnInfo;
    private ProxyState<com.resep.resepmasakan.model.ModelRecipes> proxyState;

    com_resep_resepmasakan_model_ModelRecipesRealmProxy() {
        proxyState.setConstructionFinished();
    }

    @Override
    public void realm$injectObjectContext() {
        if (this.proxyState != null) {
            return;
        }
        final BaseRealm.RealmObjectContext context = BaseRealm.objectContext.get();
        this.columnInfo = (ModelRecipesColumnInfo) context.getColumnInfo();
        this.proxyState = new ProxyState<com.resep.resepmasakan.model.ModelRecipes>(this);
        proxyState.setRealm$realm(context.getRealm());
        proxyState.setRow$realm(context.getRow());
        proxyState.setAcceptDefaultValue$realm(context.getAcceptDefaultValue());
        proxyState.setExcludeFields$realm(context.getExcludeFields());
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$strTitleResep() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.strTitleResepIndex);
    }

    @Override
    public void realmSet$strTitleResep(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.strTitleResepIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.strTitleResepIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.strTitleResepIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.strTitleResepIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$strThumbnail() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.strThumbnailIndex);
    }

    @Override
    public void realmSet$strThumbnail(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.strThumbnailIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.strThumbnailIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.strThumbnailIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.strThumbnailIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$strKeyResep() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.strKeyResepIndex);
    }

    @Override
    public void realmSet$strKeyResep(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.strKeyResepIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.strKeyResepIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.strKeyResepIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.strKeyResepIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$strTimes() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.strTimesIndex);
    }

    @Override
    public void realmSet$strTimes(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.strTimesIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.strTimesIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.strTimesIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.strTimesIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$strPortion() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.strPortionIndex);
    }

    @Override
    public void realmSet$strPortion(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.strPortionIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.strPortionIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.strPortionIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.strPortionIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$strDificulty() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.strDificultyIndex);
    }

    @Override
    public void realmSet$strDificulty(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.strDificultyIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.strDificultyIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.strDificultyIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.strDificultyIndex, value);
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder("ModelRecipes", 6, 0);
        builder.addPersistedProperty("strTitleResep", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("strThumbnail", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("strKeyResep", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("strTimes", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("strPortion", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("strDificulty", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static ModelRecipesColumnInfo createColumnInfo(OsSchemaInfo schemaInfo) {
        return new ModelRecipesColumnInfo(schemaInfo);
    }

    public static String getSimpleClassName() {
        return "ModelRecipes";
    }

    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "ModelRecipes";
    }

    @SuppressWarnings("cast")
    public static com.resep.resepmasakan.model.ModelRecipes createOrUpdateUsingJsonObject(Realm realm, JSONObject json, boolean update)
        throws JSONException {
        final List<String> excludeFields = Collections.<String> emptyList();
        com.resep.resepmasakan.model.ModelRecipes obj = realm.createObjectInternal(com.resep.resepmasakan.model.ModelRecipes.class, true, excludeFields);

        final com_resep_resepmasakan_model_ModelRecipesRealmProxyInterface objProxy = (com_resep_resepmasakan_model_ModelRecipesRealmProxyInterface) obj;
        if (json.has("strTitleResep")) {
            if (json.isNull("strTitleResep")) {
                objProxy.realmSet$strTitleResep(null);
            } else {
                objProxy.realmSet$strTitleResep((String) json.getString("strTitleResep"));
            }
        }
        if (json.has("strThumbnail")) {
            if (json.isNull("strThumbnail")) {
                objProxy.realmSet$strThumbnail(null);
            } else {
                objProxy.realmSet$strThumbnail((String) json.getString("strThumbnail"));
            }
        }
        if (json.has("strKeyResep")) {
            if (json.isNull("strKeyResep")) {
                objProxy.realmSet$strKeyResep(null);
            } else {
                objProxy.realmSet$strKeyResep((String) json.getString("strKeyResep"));
            }
        }
        if (json.has("strTimes")) {
            if (json.isNull("strTimes")) {
                objProxy.realmSet$strTimes(null);
            } else {
                objProxy.realmSet$strTimes((String) json.getString("strTimes"));
            }
        }
        if (json.has("strPortion")) {
            if (json.isNull("strPortion")) {
                objProxy.realmSet$strPortion(null);
            } else {
                objProxy.realmSet$strPortion((String) json.getString("strPortion"));
            }
        }
        if (json.has("strDificulty")) {
            if (json.isNull("strDificulty")) {
                objProxy.realmSet$strDificulty(null);
            } else {
                objProxy.realmSet$strDificulty((String) json.getString("strDificulty"));
            }
        }
        return obj;
    }

    @SuppressWarnings("cast")
    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public static com.resep.resepmasakan.model.ModelRecipes createUsingJsonStream(Realm realm, JsonReader reader)
        throws IOException {
        final com.resep.resepmasakan.model.ModelRecipes obj = new com.resep.resepmasakan.model.ModelRecipes();
        final com_resep_resepmasakan_model_ModelRecipesRealmProxyInterface objProxy = (com_resep_resepmasakan_model_ModelRecipesRealmProxyInterface) obj;
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (false) {
            } else if (name.equals("strTitleResep")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$strTitleResep((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$strTitleResep(null);
                }
            } else if (name.equals("strThumbnail")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$strThumbnail((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$strThumbnail(null);
                }
            } else if (name.equals("strKeyResep")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$strKeyResep((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$strKeyResep(null);
                }
            } else if (name.equals("strTimes")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$strTimes((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$strTimes(null);
                }
            } else if (name.equals("strPortion")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$strPortion((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$strPortion(null);
                }
            } else if (name.equals("strDificulty")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$strDificulty((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$strDificulty(null);
                }
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return realm.copyToRealm(obj);
    }

    public static com.resep.resepmasakan.model.ModelRecipes copyOrUpdate(Realm realm, com.resep.resepmasakan.model.ModelRecipes object, boolean update, Map<RealmModel,RealmObjectProxy> cache) {
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
            return (com.resep.resepmasakan.model.ModelRecipes) cachedRealmObject;
        }

        return copy(realm, object, update, cache);
    }

    public static com.resep.resepmasakan.model.ModelRecipes copy(Realm realm, com.resep.resepmasakan.model.ModelRecipes newObject, boolean update, Map<RealmModel,RealmObjectProxy> cache) {
        RealmObjectProxy cachedRealmObject = cache.get(newObject);
        if (cachedRealmObject != null) {
            return (com.resep.resepmasakan.model.ModelRecipes) cachedRealmObject;
        }

        // rejecting default values to avoid creating unexpected objects from RealmModel/RealmList fields.
        com.resep.resepmasakan.model.ModelRecipes realmObject = realm.createObjectInternal(com.resep.resepmasakan.model.ModelRecipes.class, false, Collections.<String>emptyList());
        cache.put(newObject, (RealmObjectProxy) realmObject);

        com_resep_resepmasakan_model_ModelRecipesRealmProxyInterface realmObjectSource = (com_resep_resepmasakan_model_ModelRecipesRealmProxyInterface) newObject;
        com_resep_resepmasakan_model_ModelRecipesRealmProxyInterface realmObjectCopy = (com_resep_resepmasakan_model_ModelRecipesRealmProxyInterface) realmObject;

        realmObjectCopy.realmSet$strTitleResep(realmObjectSource.realmGet$strTitleResep());
        realmObjectCopy.realmSet$strThumbnail(realmObjectSource.realmGet$strThumbnail());
        realmObjectCopy.realmSet$strKeyResep(realmObjectSource.realmGet$strKeyResep());
        realmObjectCopy.realmSet$strTimes(realmObjectSource.realmGet$strTimes());
        realmObjectCopy.realmSet$strPortion(realmObjectSource.realmGet$strPortion());
        realmObjectCopy.realmSet$strDificulty(realmObjectSource.realmGet$strDificulty());
        return realmObject;
    }

    public static long insert(Realm realm, com.resep.resepmasakan.model.ModelRecipes object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(com.resep.resepmasakan.model.ModelRecipes.class);
        long tableNativePtr = table.getNativePtr();
        ModelRecipesColumnInfo columnInfo = (ModelRecipesColumnInfo) realm.getSchema().getColumnInfo(com.resep.resepmasakan.model.ModelRecipes.class);
        long rowIndex = OsObject.createRow(table);
        cache.put(object, rowIndex);
        String realmGet$strTitleResep = ((com_resep_resepmasakan_model_ModelRecipesRealmProxyInterface) object).realmGet$strTitleResep();
        if (realmGet$strTitleResep != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.strTitleResepIndex, rowIndex, realmGet$strTitleResep, false);
        }
        String realmGet$strThumbnail = ((com_resep_resepmasakan_model_ModelRecipesRealmProxyInterface) object).realmGet$strThumbnail();
        if (realmGet$strThumbnail != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.strThumbnailIndex, rowIndex, realmGet$strThumbnail, false);
        }
        String realmGet$strKeyResep = ((com_resep_resepmasakan_model_ModelRecipesRealmProxyInterface) object).realmGet$strKeyResep();
        if (realmGet$strKeyResep != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.strKeyResepIndex, rowIndex, realmGet$strKeyResep, false);
        }
        String realmGet$strTimes = ((com_resep_resepmasakan_model_ModelRecipesRealmProxyInterface) object).realmGet$strTimes();
        if (realmGet$strTimes != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.strTimesIndex, rowIndex, realmGet$strTimes, false);
        }
        String realmGet$strPortion = ((com_resep_resepmasakan_model_ModelRecipesRealmProxyInterface) object).realmGet$strPortion();
        if (realmGet$strPortion != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.strPortionIndex, rowIndex, realmGet$strPortion, false);
        }
        String realmGet$strDificulty = ((com_resep_resepmasakan_model_ModelRecipesRealmProxyInterface) object).realmGet$strDificulty();
        if (realmGet$strDificulty != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.strDificultyIndex, rowIndex, realmGet$strDificulty, false);
        }
        return rowIndex;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.resep.resepmasakan.model.ModelRecipes.class);
        long tableNativePtr = table.getNativePtr();
        ModelRecipesColumnInfo columnInfo = (ModelRecipesColumnInfo) realm.getSchema().getColumnInfo(com.resep.resepmasakan.model.ModelRecipes.class);
        com.resep.resepmasakan.model.ModelRecipes object = null;
        while (objects.hasNext()) {
            object = (com.resep.resepmasakan.model.ModelRecipes) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex());
                continue;
            }
            long rowIndex = OsObject.createRow(table);
            cache.put(object, rowIndex);
            String realmGet$strTitleResep = ((com_resep_resepmasakan_model_ModelRecipesRealmProxyInterface) object).realmGet$strTitleResep();
            if (realmGet$strTitleResep != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.strTitleResepIndex, rowIndex, realmGet$strTitleResep, false);
            }
            String realmGet$strThumbnail = ((com_resep_resepmasakan_model_ModelRecipesRealmProxyInterface) object).realmGet$strThumbnail();
            if (realmGet$strThumbnail != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.strThumbnailIndex, rowIndex, realmGet$strThumbnail, false);
            }
            String realmGet$strKeyResep = ((com_resep_resepmasakan_model_ModelRecipesRealmProxyInterface) object).realmGet$strKeyResep();
            if (realmGet$strKeyResep != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.strKeyResepIndex, rowIndex, realmGet$strKeyResep, false);
            }
            String realmGet$strTimes = ((com_resep_resepmasakan_model_ModelRecipesRealmProxyInterface) object).realmGet$strTimes();
            if (realmGet$strTimes != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.strTimesIndex, rowIndex, realmGet$strTimes, false);
            }
            String realmGet$strPortion = ((com_resep_resepmasakan_model_ModelRecipesRealmProxyInterface) object).realmGet$strPortion();
            if (realmGet$strPortion != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.strPortionIndex, rowIndex, realmGet$strPortion, false);
            }
            String realmGet$strDificulty = ((com_resep_resepmasakan_model_ModelRecipesRealmProxyInterface) object).realmGet$strDificulty();
            if (realmGet$strDificulty != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.strDificultyIndex, rowIndex, realmGet$strDificulty, false);
            }
        }
    }

    public static long insertOrUpdate(Realm realm, com.resep.resepmasakan.model.ModelRecipes object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(com.resep.resepmasakan.model.ModelRecipes.class);
        long tableNativePtr = table.getNativePtr();
        ModelRecipesColumnInfo columnInfo = (ModelRecipesColumnInfo) realm.getSchema().getColumnInfo(com.resep.resepmasakan.model.ModelRecipes.class);
        long rowIndex = OsObject.createRow(table);
        cache.put(object, rowIndex);
        String realmGet$strTitleResep = ((com_resep_resepmasakan_model_ModelRecipesRealmProxyInterface) object).realmGet$strTitleResep();
        if (realmGet$strTitleResep != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.strTitleResepIndex, rowIndex, realmGet$strTitleResep, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.strTitleResepIndex, rowIndex, false);
        }
        String realmGet$strThumbnail = ((com_resep_resepmasakan_model_ModelRecipesRealmProxyInterface) object).realmGet$strThumbnail();
        if (realmGet$strThumbnail != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.strThumbnailIndex, rowIndex, realmGet$strThumbnail, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.strThumbnailIndex, rowIndex, false);
        }
        String realmGet$strKeyResep = ((com_resep_resepmasakan_model_ModelRecipesRealmProxyInterface) object).realmGet$strKeyResep();
        if (realmGet$strKeyResep != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.strKeyResepIndex, rowIndex, realmGet$strKeyResep, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.strKeyResepIndex, rowIndex, false);
        }
        String realmGet$strTimes = ((com_resep_resepmasakan_model_ModelRecipesRealmProxyInterface) object).realmGet$strTimes();
        if (realmGet$strTimes != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.strTimesIndex, rowIndex, realmGet$strTimes, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.strTimesIndex, rowIndex, false);
        }
        String realmGet$strPortion = ((com_resep_resepmasakan_model_ModelRecipesRealmProxyInterface) object).realmGet$strPortion();
        if (realmGet$strPortion != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.strPortionIndex, rowIndex, realmGet$strPortion, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.strPortionIndex, rowIndex, false);
        }
        String realmGet$strDificulty = ((com_resep_resepmasakan_model_ModelRecipesRealmProxyInterface) object).realmGet$strDificulty();
        if (realmGet$strDificulty != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.strDificultyIndex, rowIndex, realmGet$strDificulty, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.strDificultyIndex, rowIndex, false);
        }
        return rowIndex;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.resep.resepmasakan.model.ModelRecipes.class);
        long tableNativePtr = table.getNativePtr();
        ModelRecipesColumnInfo columnInfo = (ModelRecipesColumnInfo) realm.getSchema().getColumnInfo(com.resep.resepmasakan.model.ModelRecipes.class);
        com.resep.resepmasakan.model.ModelRecipes object = null;
        while (objects.hasNext()) {
            object = (com.resep.resepmasakan.model.ModelRecipes) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex());
                continue;
            }
            long rowIndex = OsObject.createRow(table);
            cache.put(object, rowIndex);
            String realmGet$strTitleResep = ((com_resep_resepmasakan_model_ModelRecipesRealmProxyInterface) object).realmGet$strTitleResep();
            if (realmGet$strTitleResep != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.strTitleResepIndex, rowIndex, realmGet$strTitleResep, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.strTitleResepIndex, rowIndex, false);
            }
            String realmGet$strThumbnail = ((com_resep_resepmasakan_model_ModelRecipesRealmProxyInterface) object).realmGet$strThumbnail();
            if (realmGet$strThumbnail != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.strThumbnailIndex, rowIndex, realmGet$strThumbnail, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.strThumbnailIndex, rowIndex, false);
            }
            String realmGet$strKeyResep = ((com_resep_resepmasakan_model_ModelRecipesRealmProxyInterface) object).realmGet$strKeyResep();
            if (realmGet$strKeyResep != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.strKeyResepIndex, rowIndex, realmGet$strKeyResep, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.strKeyResepIndex, rowIndex, false);
            }
            String realmGet$strTimes = ((com_resep_resepmasakan_model_ModelRecipesRealmProxyInterface) object).realmGet$strTimes();
            if (realmGet$strTimes != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.strTimesIndex, rowIndex, realmGet$strTimes, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.strTimesIndex, rowIndex, false);
            }
            String realmGet$strPortion = ((com_resep_resepmasakan_model_ModelRecipesRealmProxyInterface) object).realmGet$strPortion();
            if (realmGet$strPortion != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.strPortionIndex, rowIndex, realmGet$strPortion, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.strPortionIndex, rowIndex, false);
            }
            String realmGet$strDificulty = ((com_resep_resepmasakan_model_ModelRecipesRealmProxyInterface) object).realmGet$strDificulty();
            if (realmGet$strDificulty != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.strDificultyIndex, rowIndex, realmGet$strDificulty, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.strDificultyIndex, rowIndex, false);
            }
        }
    }

    public static com.resep.resepmasakan.model.ModelRecipes createDetachedCopy(com.resep.resepmasakan.model.ModelRecipes realmObject, int currentDepth, int maxDepth, Map<RealmModel, CacheData<RealmModel>> cache) {
        if (currentDepth > maxDepth || realmObject == null) {
            return null;
        }
        CacheData<RealmModel> cachedObject = cache.get(realmObject);
        com.resep.resepmasakan.model.ModelRecipes unmanagedObject;
        if (cachedObject == null) {
            unmanagedObject = new com.resep.resepmasakan.model.ModelRecipes();
            cache.put(realmObject, new RealmObjectProxy.CacheData<RealmModel>(currentDepth, unmanagedObject));
        } else {
            // Reuse cached object or recreate it because it was encountered at a lower depth.
            if (currentDepth >= cachedObject.minDepth) {
                return (com.resep.resepmasakan.model.ModelRecipes) cachedObject.object;
            }
            unmanagedObject = (com.resep.resepmasakan.model.ModelRecipes) cachedObject.object;
            cachedObject.minDepth = currentDepth;
        }
        com_resep_resepmasakan_model_ModelRecipesRealmProxyInterface unmanagedCopy = (com_resep_resepmasakan_model_ModelRecipesRealmProxyInterface) unmanagedObject;
        com_resep_resepmasakan_model_ModelRecipesRealmProxyInterface realmSource = (com_resep_resepmasakan_model_ModelRecipesRealmProxyInterface) realmObject;
        unmanagedCopy.realmSet$strTitleResep(realmSource.realmGet$strTitleResep());
        unmanagedCopy.realmSet$strThumbnail(realmSource.realmGet$strThumbnail());
        unmanagedCopy.realmSet$strKeyResep(realmSource.realmGet$strKeyResep());
        unmanagedCopy.realmSet$strTimes(realmSource.realmGet$strTimes());
        unmanagedCopy.realmSet$strPortion(realmSource.realmGet$strPortion());
        unmanagedCopy.realmSet$strDificulty(realmSource.realmGet$strDificulty());

        return unmanagedObject;
    }

    @Override
    @SuppressWarnings("ArrayToString")
    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder stringBuilder = new StringBuilder("ModelRecipes = proxy[");
        stringBuilder.append("{strTitleResep:");
        stringBuilder.append(realmGet$strTitleResep() != null ? realmGet$strTitleResep() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{strThumbnail:");
        stringBuilder.append(realmGet$strThumbnail() != null ? realmGet$strThumbnail() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{strKeyResep:");
        stringBuilder.append(realmGet$strKeyResep() != null ? realmGet$strKeyResep() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{strTimes:");
        stringBuilder.append(realmGet$strTimes() != null ? realmGet$strTimes() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{strPortion:");
        stringBuilder.append(realmGet$strPortion() != null ? realmGet$strPortion() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{strDificulty:");
        stringBuilder.append(realmGet$strDificulty() != null ? realmGet$strDificulty() : "null");
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
        com_resep_resepmasakan_model_ModelRecipesRealmProxy aModelRecipes = (com_resep_resepmasakan_model_ModelRecipesRealmProxy)o;

        String path = proxyState.getRealm$realm().getPath();
        String otherPath = aModelRecipes.proxyState.getRealm$realm().getPath();
        if (path != null ? !path.equals(otherPath) : otherPath != null) return false;

        String tableName = proxyState.getRow$realm().getTable().getName();
        String otherTableName = aModelRecipes.proxyState.getRow$realm().getTable().getName();
        if (tableName != null ? !tableName.equals(otherTableName) : otherTableName != null) return false;

        if (proxyState.getRow$realm().getIndex() != aModelRecipes.proxyState.getRow$realm().getIndex()) return false;

        return true;
    }
}
