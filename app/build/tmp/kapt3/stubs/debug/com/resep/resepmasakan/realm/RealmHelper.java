package com.resep.resepmasakan.realm;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004JB\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\f2\b\u0010\u0010\u001a\u0004\u0018\u00010\f2\b\u0010\u0011\u001a\u0004\u0018\u00010\fJ\u0010\u0010\u0012\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fJ\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\u0016"}, d2 = {"Lcom/resep/resepmasakan/realm/RealmHelper;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "realm", "Lio/realm/Realm;", "getRealm", "()Lio/realm/Realm;", "addFavoriteRecipes", "", "KeyResep", "", "TitleResep", "Thumbnail", "Dificulty", "StrPortion", "Times", "deleteFavoriteRecipes", "showFavoriteRecipes", "Ljava/util/ArrayList;", "Lcom/resep/resepmasakan/model/ModelRecipes;", "app_debug"})
public final class RealmHelper {
    @org.jetbrains.annotations.NotNull()
    private final io.realm.Realm realm = null;
    
    public RealmHelper(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.realm.Realm getRealm() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.resep.resepmasakan.model.ModelRecipes> showFavoriteRecipes() {
        return null;
    }
    
    public final void addFavoriteRecipes(@org.jetbrains.annotations.Nullable()
    java.lang.String KeyResep, @org.jetbrains.annotations.Nullable()
    java.lang.String TitleResep, @org.jetbrains.annotations.Nullable()
    java.lang.String Thumbnail, @org.jetbrains.annotations.Nullable()
    java.lang.String Dificulty, @org.jetbrains.annotations.Nullable()
    java.lang.String StrPortion, @org.jetbrains.annotations.Nullable()
    java.lang.String Times) {
    }
    
    public final void deleteFavoriteRecipes(@org.jetbrains.annotations.Nullable()
    java.lang.String KeyResep) {
    }
}