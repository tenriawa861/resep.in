package com.resep.resepmasakan.activities;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b#\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 ]2\u00020\u0001:\u0001]B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010T\u001a\u00020UH\u0002J\u0012\u0010V\u001a\u00020U2\b\u0010W\u001a\u0004\u0018\u00010XH\u0014J\u0010\u0010Y\u001a\u00020Z2\u0006\u0010[\u001a\u00020\\H\u0016R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR \u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00170\u001dX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0013\"\u0004\b\u001f\u0010\u0015R \u0010 \u001a\b\u0012\u0004\u0012\u00020!0\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0013\"\u0004\b#\u0010\u0015R\u001c\u0010$\u001a\u0004\u0018\u00010%X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\'\"\u0004\b(\u0010)R\u001c\u0010*\u001a\u0004\u0018\u00010+X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\u001c\u00100\u001a\u0004\u0018\u000101X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\u001c\u00106\u001a\u0004\u0018\u000101X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b7\u00103\"\u0004\b8\u00105R\u001c\u00109\u001a\u0004\u0018\u000101X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b:\u00103\"\u0004\b;\u00105R\u001c\u0010<\u001a\u0004\u0018\u000101X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b=\u00103\"\u0004\b>\u00105R\u001c\u0010?\u001a\u0004\u0018\u000101X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b@\u00103\"\u0004\bA\u00105R\u001c\u0010B\u001a\u0004\u0018\u000101X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bC\u00103\"\u0004\bD\u00105R\u001c\u0010E\u001a\u0004\u0018\u000101X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bF\u00103\"\u0004\bG\u00105R\u001c\u0010H\u001a\u0004\u0018\u000101X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bI\u00103\"\u0004\bJ\u00105R\u001c\u0010K\u001a\u0004\u0018\u000101X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bL\u00103\"\u0004\bM\u00105R\u001c\u0010N\u001a\u0004\u0018\u000101X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bO\u00103\"\u0004\bP\u00105R\u001c\u0010Q\u001a\u0004\u0018\u000101X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bR\u00103\"\u0004\bS\u00105\u00a8\u0006^"}, d2 = {"Lcom/resep/resepmasakan/activities/DetailRecipesActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "helper", "Lcom/resep/resepmasakan/realm/RealmHelper;", "getHelper", "()Lcom/resep/resepmasakan/realm/RealmHelper;", "setHelper", "(Lcom/resep/resepmasakan/realm/RealmHelper;)V", "ingredientsAdapter", "Lcom/resep/resepmasakan/adapter/IngredientsAdapter;", "getIngredientsAdapter", "()Lcom/resep/resepmasakan/adapter/IngredientsAdapter;", "setIngredientsAdapter", "(Lcom/resep/resepmasakan/adapter/IngredientsAdapter;)V", "modelIngredients", "", "Lcom/resep/resepmasakan/model/ModelIngredients;", "getModelIngredients", "()Ljava/util/List;", "setModelIngredients", "(Ljava/util/List;)V", "modelRecipes", "Lcom/resep/resepmasakan/model/ModelRecipes;", "getModelRecipes", "()Lcom/resep/resepmasakan/model/ModelRecipes;", "setModelRecipes", "(Lcom/resep/resepmasakan/model/ModelRecipes;)V", "modelRecipesRealm", "", "getModelRecipesRealm", "setModelRecipesRealm", "modelSteps", "Lcom/resep/resepmasakan/model/ModelSteps;", "getModelSteps", "setModelSteps", "progressDialog", "Landroid/app/ProgressDialog;", "getProgressDialog", "()Landroid/app/ProgressDialog;", "setProgressDialog", "(Landroid/app/ProgressDialog;)V", "stepsAdapter", "Lcom/resep/resepmasakan/adapter/StepsAdapter;", "getStepsAdapter", "()Lcom/resep/resepmasakan/adapter/StepsAdapter;", "setStepsAdapter", "(Lcom/resep/resepmasakan/adapter/StepsAdapter;)V", "strAuthor", "", "getStrAuthor", "()Ljava/lang/String;", "setStrAuthor", "(Ljava/lang/String;)V", "strDate", "getStrDate", "setStrDate", "strDesc", "getStrDesc", "setStrDesc", "strDificulty", "getStrDificulty", "setStrDificulty", "strIngredient", "getStrIngredient", "setStrIngredient", "strPortion", "getStrPortion", "setStrPortion", "strRecipeKey", "getStrRecipeKey", "setStrRecipeKey", "strStep", "getStrStep", "setStrStep", "strThumbnail", "getStrThumbnail", "setStrThumbnail", "strTimes", "getStrTimes", "setStrTimes", "strTitleRecipe", "getStrTitleRecipe", "setStrTitleRecipe", "getDetailRecipes", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onOptionsItemSelected", "", "item", "Landroid/view/MenuItem;", "Companion", "app_debug"})
public final class DetailRecipesActivity extends androidx.appcompat.app.AppCompatActivity {
    @org.jetbrains.annotations.Nullable()
    private com.resep.resepmasakan.model.ModelRecipes modelRecipes;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<com.resep.resepmasakan.model.ModelIngredients> modelIngredients;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<? extends com.resep.resepmasakan.model.ModelRecipes> modelRecipesRealm;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<com.resep.resepmasakan.model.ModelSteps> modelSteps;
    @org.jetbrains.annotations.Nullable()
    private com.resep.resepmasakan.adapter.IngredientsAdapter ingredientsAdapter;
    @org.jetbrains.annotations.Nullable()
    private com.resep.resepmasakan.adapter.StepsAdapter stepsAdapter;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String strRecipeKey;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String strThumbnail;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String strTitleRecipe;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String strAuthor;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String strDate;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String strDificulty;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String strPortion;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String strTimes;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String strDesc;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String strIngredient;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String strStep;
    @org.jetbrains.annotations.Nullable()
    private android.app.ProgressDialog progressDialog;
    @org.jetbrains.annotations.Nullable()
    private com.resep.resepmasakan.realm.RealmHelper helper;
    @org.jetbrains.annotations.NotNull()
    public static final com.resep.resepmasakan.activities.DetailRecipesActivity.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String DETAIL_RECIPES = "strDetailRecipes";
    private java.util.HashMap _$_findViewCache;
    
    public DetailRecipesActivity() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.resep.resepmasakan.model.ModelRecipes getModelRecipes() {
        return null;
    }
    
    public final void setModelRecipes(@org.jetbrains.annotations.Nullable()
    com.resep.resepmasakan.model.ModelRecipes p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.resep.resepmasakan.model.ModelIngredients> getModelIngredients() {
        return null;
    }
    
    public final void setModelIngredients(@org.jetbrains.annotations.NotNull()
    java.util.List<com.resep.resepmasakan.model.ModelIngredients> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.resep.resepmasakan.model.ModelRecipes> getModelRecipesRealm() {
        return null;
    }
    
    public final void setModelRecipesRealm(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends com.resep.resepmasakan.model.ModelRecipes> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.resep.resepmasakan.model.ModelSteps> getModelSteps() {
        return null;
    }
    
    public final void setModelSteps(@org.jetbrains.annotations.NotNull()
    java.util.List<com.resep.resepmasakan.model.ModelSteps> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.resep.resepmasakan.adapter.IngredientsAdapter getIngredientsAdapter() {
        return null;
    }
    
    public final void setIngredientsAdapter(@org.jetbrains.annotations.Nullable()
    com.resep.resepmasakan.adapter.IngredientsAdapter p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.resep.resepmasakan.adapter.StepsAdapter getStepsAdapter() {
        return null;
    }
    
    public final void setStepsAdapter(@org.jetbrains.annotations.Nullable()
    com.resep.resepmasakan.adapter.StepsAdapter p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getStrRecipeKey() {
        return null;
    }
    
    public final void setStrRecipeKey(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getStrThumbnail() {
        return null;
    }
    
    public final void setStrThumbnail(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getStrTitleRecipe() {
        return null;
    }
    
    public final void setStrTitleRecipe(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getStrAuthor() {
        return null;
    }
    
    public final void setStrAuthor(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getStrDate() {
        return null;
    }
    
    public final void setStrDate(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getStrDificulty() {
        return null;
    }
    
    public final void setStrDificulty(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getStrPortion() {
        return null;
    }
    
    public final void setStrPortion(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getStrTimes() {
        return null;
    }
    
    public final void setStrTimes(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getStrDesc() {
        return null;
    }
    
    public final void setStrDesc(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getStrIngredient() {
        return null;
    }
    
    public final void setStrIngredient(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getStrStep() {
        return null;
    }
    
    public final void setStrStep(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.app.ProgressDialog getProgressDialog() {
        return null;
    }
    
    public final void setProgressDialog(@org.jetbrains.annotations.Nullable()
    android.app.ProgressDialog p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.resep.resepmasakan.realm.RealmHelper getHelper() {
        return null;
    }
    
    public final void setHelper(@org.jetbrains.annotations.Nullable()
    com.resep.resepmasakan.realm.RealmHelper p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void getDetailRecipes() {
    }
    
    @java.lang.Override()
    public boolean onOptionsItemSelected(@org.jetbrains.annotations.NotNull()
    android.view.MenuItem item) {
        return false;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u001e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lcom/resep/resepmasakan/activities/DetailRecipesActivity$Companion;", "", "()V", "DETAIL_RECIPES", "", "setWindowFlag", "", "activity", "Landroid/app/Activity;", "bits", "", "on", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        public final void setWindowFlag(@org.jetbrains.annotations.NotNull()
        android.app.Activity activity, int bits, boolean on) {
        }
    }
}