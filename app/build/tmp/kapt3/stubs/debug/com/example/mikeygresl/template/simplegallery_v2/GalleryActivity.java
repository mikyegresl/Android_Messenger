package com.example.mikeygresl.template.simplegallery_v2;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u00152\u00020\u0001:\u0006\u0015\u0016\u0017\u0018\u0019\u001aB\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\u0012\u0010\u0012\u001a\u00020\u00112\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0014R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u001b\u0010\t\u001a\u00020\n8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\r\u0010\b\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001b"}, d2 = {"Lcom/example/mikeygresl/template/simplegallery_v2/GalleryActivity;", "Landroid/support/v7/app/AppCompatActivity;", "()V", "controller", "Lcom/example/mikeygresl/template/simplegallery_v2/UnsplashViewModel;", "getController", "()Lcom/example/mikeygresl/template/simplegallery_v2/UnsplashViewModel;", "controller$delegate", "Lkotlin/Lazy;", "fullscreenPhotoView", "Lcom/example/mikeygresl/template/simplegallery_v2/GalleryActivity$FullscreenPhotoView;", "getFullscreenPhotoView", "()Lcom/example/mikeygresl/template/simplegallery_v2/GalleryActivity$FullscreenPhotoView;", "fullscreenPhotoView$delegate", "galleryView", "Lcom/example/mikeygresl/template/simplegallery_v2/GalleryActivity$PhotosGalleryUi;", "onBackPressed", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "Companion", "FullscreenPhotoView", "PhotoHolder", "PhotoView", "PhotosAdapter", "PhotosGalleryUi", "app_debug"})
public final class GalleryActivity extends android.support.v7.app.AppCompatActivity {
    private final com.example.mikeygresl.template.simplegallery_v2.GalleryActivity.PhotosGalleryUi galleryView = null;
    private final kotlin.Lazy fullscreenPhotoView$delegate = null;
    private final kotlin.Lazy controller$delegate = null;
    public static final com.example.mikeygresl.template.simplegallery_v2.GalleryActivity.Companion Companion = null;
    
    private final com.example.mikeygresl.template.simplegallery_v2.GalleryActivity.FullscreenPhotoView getFullscreenPhotoView() {
        return null;
    }
    
    private final com.example.mikeygresl.template.simplegallery_v2.UnsplashViewModel getController() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onBackPressed() {
    }
    
    public GalleryActivity() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rJ\u0006\u0010\u000e\u001a\u00020\u000fJ\b\u0010\u0010\u001a\u00020\u0011H\u0002J\u0016\u0010\u0012\u001a\u00020\u000b2\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lcom/example/mikeygresl/template/simplegallery_v2/GalleryActivity$PhotosGalleryUi;", "", "()V", "adapter", "Lcom/example/mikeygresl/template/simplegallery_v2/GalleryActivity$PhotosAdapter;", "data", "Landroid/arch/paging/PagedList;", "Lcom/example/mikeygresl/template/simplegallery_v2/objects/Photo;", "gridView", "Landroid/support/v7/widget/RecyclerView;", "create", "", "context", "Landroid/content/Context;", "getRoot", "Landroid/view/View;", "getScrolledItemsCount", "", "setPhotos", "app_debug"})
    public static final class PhotosGalleryUi {
        private android.support.v7.widget.RecyclerView gridView;
        private com.example.mikeygresl.template.simplegallery_v2.GalleryActivity.PhotosAdapter adapter;
        private android.arch.paging.PagedList<com.example.mikeygresl.template.simplegallery_v2.objects.Photo> data;
        
        @org.jetbrains.annotations.NotNull()
        public final android.view.View getRoot() {
            return null;
        }
        
        public final void create(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
        }
        
        private final int getScrolledItemsCount() {
            return 0;
        }
        
        public final void setPhotos(@org.jetbrains.annotations.Nullable()
        android.arch.paging.PagedList<com.example.mikeygresl.template.simplegallery_v2.objects.Photo> data) {
        }
        
        public PhotosGalleryUi() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007\b\u0016\u00a2\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH\u0016J\u0018\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\tH\u0016J\u0010\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0003H\u0016J\u0010\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0003H\u0016\u00a8\u0006\u0010"}, d2 = {"Lcom/example/mikeygresl/template/simplegallery_v2/GalleryActivity$PhotosAdapter;", "Landroid/arch/paging/PagedListAdapter;", "Lcom/example/mikeygresl/template/simplegallery_v2/objects/Photo;", "Lcom/example/mikeygresl/template/simplegallery_v2/GalleryActivity$PhotoHolder;", "()V", "onBindViewHolder", "", "holder", "position", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "onViewDetachedFromWindow", "onViewRecycled", "app_debug"})
    public static final class PhotosAdapter extends android.arch.paging.PagedListAdapter<com.example.mikeygresl.template.simplegallery_v2.objects.Photo, com.example.mikeygresl.template.simplegallery_v2.GalleryActivity.PhotoHolder> {
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public com.example.mikeygresl.template.simplegallery_v2.GalleryActivity.PhotoHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.ViewGroup parent, int viewType) {
            return null;
        }
        
        @java.lang.Override()
        public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
        com.example.mikeygresl.template.simplegallery_v2.GalleryActivity.PhotoHolder holder, int position) {
        }
        
        @java.lang.Override()
        public void onViewDetachedFromWindow(@org.jetbrains.annotations.NotNull()
        com.example.mikeygresl.template.simplegallery_v2.GalleryActivity.PhotoHolder holder) {
        }
        
        @java.lang.Override()
        public void onViewRecycled(@org.jetbrains.annotations.NotNull()
        com.example.mikeygresl.template.simplegallery_v2.GalleryActivity.PhotoHolder holder) {
        }
        
        public PhotosAdapter() {
            super(null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\f"}, d2 = {"Lcom/example/mikeygresl/template/simplegallery_v2/GalleryActivity$PhotoHolder;", "Landroid/support/v7/widget/RecyclerView$ViewHolder;", "photoView", "Lcom/example/mikeygresl/template/simplegallery_v2/GalleryActivity$PhotoView;", "(Lcom/example/mikeygresl/template/simplegallery_v2/GalleryActivity$PhotoView;)V", "getPhotoView", "()Lcom/example/mikeygresl/template/simplegallery_v2/GalleryActivity$PhotoView;", "bind", "", "photo", "Lcom/example/mikeygresl/template/simplegallery_v2/objects/Photo;", "Companion", "app_debug"})
    public static final class PhotoHolder extends android.support.v7.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final com.example.mikeygresl.template.simplegallery_v2.GalleryActivity.PhotoView photoView = null;
        public static final com.example.mikeygresl.template.simplegallery_v2.GalleryActivity.PhotoHolder.Companion Companion = null;
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        com.example.mikeygresl.template.simplegallery_v2.objects.Photo photo) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.example.mikeygresl.template.simplegallery_v2.GalleryActivity.PhotoView getPhotoView() {
            return null;
        }
        
        public PhotoHolder(@org.jetbrains.annotations.NotNull()
        com.example.mikeygresl.template.simplegallery_v2.GalleryActivity.PhotoView photoView) {
            super(null);
        }
        
        @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b\u00a8\u0006\t"}, d2 = {"Lcom/example/mikeygresl/template/simplegallery_v2/GalleryActivity$PhotoHolder$Companion;", "", "()V", "create", "Lcom/example/mikeygresl/template/simplegallery_v2/GalleryActivity$PhotoHolder;", "parent", "Landroid/view/ViewGroup;", "height", "", "app_debug"})
        public static final class Companion {
            
            @org.jetbrains.annotations.NotNull()
            public final com.example.mikeygresl.template.simplegallery_v2.GalleryActivity.PhotoHolder create(@org.jetbrains.annotations.NotNull()
            android.view.ViewGroup parent, int height) {
                return null;
            }
            
            private Companion() {
                super();
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0007\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J \u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0014J0\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001dH\u0014J\u0018\u0010!\u001a\u00020\u001a2\u0006\u0010\"\u001a\u00020\u001d2\u0006\u0010#\u001a\u00020\u001dH\u0014J\u0014\u0010$\u001a\u00020\u001d*\u00020\u001d2\u0006\u0010%\u001a\u00020&H\u0002R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u000b\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\'"}, d2 = {"Lcom/example/mikeygresl/template/simplegallery_v2/GalleryActivity$PhotoView;", "Landroid/view/ViewGroup;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "photo", "Landroid/support/v7/widget/AppCompatImageView;", "getPhoto", "()Landroid/support/v7/widget/AppCompatImageView;", "textLayerMask", "Landroid/graphics/drawable/GradientDrawable;", "title", "Landroid/support/v7/widget/AppCompatTextView;", "getTitle", "()Landroid/support/v7/widget/AppCompatTextView;", "tmpRect", "Landroid/graphics/Rect;", "drawChild", "", "canvas", "Landroid/graphics/Canvas;", "child", "Landroid/view/View;", "drawingTime", "", "onLayout", "", "changed", "l", "", "t", "r", "b", "onMeasure", "widthMeasureSpec", "heightMeasureSpec", "alpha", "value", "", "app_debug"})
    public static final class PhotoView extends android.view.ViewGroup {
        private final android.graphics.drawable.GradientDrawable textLayerMask = null;
        @org.jetbrains.annotations.NotNull()
        private final android.support.v7.widget.AppCompatImageView photo = null;
        @org.jetbrains.annotations.NotNull()
        private final android.support.v7.widget.AppCompatTextView title = null;
        private final android.graphics.Rect tmpRect = null;
        
        private final int alpha(int $receiver, float value) {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.support.v7.widget.AppCompatImageView getPhoto() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.support.v7.widget.AppCompatTextView getTitle() {
            return null;
        }
        
        @java.lang.Override()
        protected void onLayout(boolean changed, int l, int t, int r, int b) {
        }
        
        @java.lang.Override()
        protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        }
        
        @java.lang.Override()
        protected boolean drawChild(@org.jetbrains.annotations.NotNull()
        android.graphics.Canvas canvas, @org.jetbrains.annotations.NotNull()
        android.view.View child, long drawingTime) {
            return false;
        }
        
        public PhotoView(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            super(null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014J\u0006\u0010\u0015\u001a\u00020\u0012J\u0006\u0010\u0016\u001a\u00020\u0017J\u000e\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u0019R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010\u00a8\u0006\u001a"}, d2 = {"Lcom/example/mikeygresl/template/simplegallery_v2/GalleryActivity$FullscreenPhotoView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "photo", "Landroid/support/v7/widget/AppCompatImageView;", "getPhoto", "()Landroid/support/v7/widget/AppCompatImageView;", "progress", "Landroid/widget/ProgressBar;", "getProgress", "()Landroid/widget/ProgressBar;", "target", "Lcom/squareup/picasso/Target;", "getTarget", "()Lcom/squareup/picasso/Target;", "attachTo", "", "activity", "Landroid/app/Activity;", "detach", "isAttached", "", "setPhoto", "Lcom/example/mikeygresl/template/simplegallery_v2/objects/Photo;", "app_debug"})
    public static final class FullscreenPhotoView extends android.widget.FrameLayout {
        @org.jetbrains.annotations.NotNull()
        private final android.widget.ProgressBar progress = null;
        @org.jetbrains.annotations.NotNull()
        private final android.support.v7.widget.AppCompatImageView photo = null;
        @org.jetbrains.annotations.NotNull()
        private final com.squareup.picasso.Target target = null;
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.ProgressBar getProgress() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.support.v7.widget.AppCompatImageView getPhoto() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.squareup.picasso.Target getTarget() {
            return null;
        }
        
        public final boolean isAttached() {
            return false;
        }
        
        public final void detach() {
        }
        
        public final void attachTo(@org.jetbrains.annotations.NotNull()
        android.app.Activity activity) {
        }
        
        public final void setPhoto(@org.jetbrains.annotations.NotNull()
        com.example.mikeygresl.template.simplegallery_v2.objects.Photo photo) {
        }
        
        public FullscreenPhotoView(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            super(null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0019\u0010\u0003\u001a\u0002H\u0004\"\b\b\u0000\u0010\u0004*\u00020\u0005*\u00020\u0006\u00a2\u0006\u0002\u0010\u0007\u00a8\u0006\b"}, d2 = {"Lcom/example/mikeygresl/template/simplegallery_v2/GalleryActivity$Companion;", "", "()V", "getActivity", "T", "Landroid/app/Activity;", "Landroid/content/Context;", "(Landroid/content/Context;)Landroid/app/Activity;", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final <T extends android.app.Activity>T getActivity(@org.jetbrains.annotations.NotNull()
        android.content.Context $receiver) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}