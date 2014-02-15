/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.gmp.desktop.views;

import java.beans.*;

/**
 *
 * @author kaciano
 */
public class ViewFrameBeanInfo extends SimpleBeanInfo {

    // Bean descriptor//GEN-FIRST:BeanDescriptor
    /*lazy BeanDescriptor*/
    private static BeanDescriptor getBdescriptor(){
        BeanDescriptor beanDescriptor = new BeanDescriptor  ( br.com.gmp.desktop.views.ViewFrame.class , null ); // NOI18N//GEN-HEADEREND:BeanDescriptor
    // Here you can add code for customizing the BeanDescriptor.

        return beanDescriptor;     }//GEN-LAST:BeanDescriptor


    // Property identifiers//GEN-FIRST:Properties
    private static final int PROPERTY_accessibleContext = 0;
    private static final int PROPERTY_actionMap = 1;
    private static final int PROPERTY_alignmentX = 2;
    private static final int PROPERTY_alignmentY = 3;
    private static final int PROPERTY_ancestorListeners = 4;
    private static final int PROPERTY_autoscrolls = 5;
    private static final int PROPERTY_background = 6;
    private static final int PROPERTY_backgroundSet = 7;
    private static final int PROPERTY_baselineResizeBehavior = 8;
    private static final int PROPERTY_border = 9;
    private static final int PROPERTY_bounds = 10;
    private static final int PROPERTY_closable = 11;
    private static final int PROPERTY_closed = 12;
    private static final int PROPERTY_colorModel = 13;
    private static final int PROPERTY_component = 14;
    private static final int PROPERTY_componentCount = 15;
    private static final int PROPERTY_componentListeners = 16;
    private static final int PROPERTY_componentOrientation = 17;
    private static final int PROPERTY_componentPopupMenu = 18;
    private static final int PROPERTY_components = 19;
    private static final int PROPERTY_containerListeners = 20;
    private static final int PROPERTY_contentPane = 21;
    private static final int PROPERTY_cursor = 22;
    private static final int PROPERTY_cursorSet = 23;
    private static final int PROPERTY_debugGraphicsOptions = 24;
    private static final int PROPERTY_defaultCloseOperation = 25;
    private static final int PROPERTY_desktopIcon = 26;
    private static final int PROPERTY_desktopPane = 27;
    private static final int PROPERTY_displayable = 28;
    private static final int PROPERTY_doubleBuffered = 29;
    private static final int PROPERTY_dropTarget = 30;
    private static final int PROPERTY_enabled = 31;
    private static final int PROPERTY_focusable = 32;
    private static final int PROPERTY_focusCycleRoot = 33;
    private static final int PROPERTY_focusCycleRootAncestor = 34;
    private static final int PROPERTY_focusListeners = 35;
    private static final int PROPERTY_focusOwner = 36;
    private static final int PROPERTY_focusTraversable = 37;
    private static final int PROPERTY_focusTraversalKeys = 38;
    private static final int PROPERTY_focusTraversalKeysEnabled = 39;
    private static final int PROPERTY_focusTraversalPolicy = 40;
    private static final int PROPERTY_focusTraversalPolicyProvider = 41;
    private static final int PROPERTY_focusTraversalPolicySet = 42;
    private static final int PROPERTY_font = 43;
    private static final int PROPERTY_fontSet = 44;
    private static final int PROPERTY_foreground = 45;
    private static final int PROPERTY_foregroundSet = 46;
    private static final int PROPERTY_frameIcon = 47;
    private static final int PROPERTY_glassPane = 48;
    private static final int PROPERTY_graphics = 49;
    private static final int PROPERTY_graphicsConfiguration = 50;
    private static final int PROPERTY_height = 51;
    private static final int PROPERTY_hierarchyBoundsListeners = 52;
    private static final int PROPERTY_hierarchyListeners = 53;
    private static final int PROPERTY_icon = 54;
    private static final int PROPERTY_iconifiable = 55;
    private static final int PROPERTY_ignoreRepaint = 56;
    private static final int PROPERTY_inheritsPopupMenu = 57;
    private static final int PROPERTY_inputContext = 58;
    private static final int PROPERTY_inputMap = 59;
    private static final int PROPERTY_inputMethodListeners = 60;
    private static final int PROPERTY_inputMethodRequests = 61;
    private static final int PROPERTY_inputVerifier = 62;
    private static final int PROPERTY_insets = 63;
    private static final int PROPERTY_internalFrameListeners = 64;
    private static final int PROPERTY_JMenuBar = 65;
    private static final int PROPERTY_keyListeners = 66;
    private static final int PROPERTY_lastCursor = 67;
    private static final int PROPERTY_layer = 68;
    private static final int PROPERTY_layeredPane = 69;
    private static final int PROPERTY_layout = 70;
    private static final int PROPERTY_level = 71;
    private static final int PROPERTY_lightweight = 72;
    private static final int PROPERTY_locale = 73;
    private static final int PROPERTY_location = 74;
    private static final int PROPERTY_locationOnScreen = 75;
    private static final int PROPERTY_managingFocus = 76;
    private static final int PROPERTY_maximizable = 77;
    private static final int PROPERTY_maximum = 78;
    private static final int PROPERTY_maximumSize = 79;
    private static final int PROPERTY_maximumSizeSet = 80;
    private static final int PROPERTY_menuBar = 81;
    private static final int PROPERTY_minimumSize = 82;
    private static final int PROPERTY_minimumSizeSet = 83;
    private static final int PROPERTY_mostRecentFocusOwner = 84;
    private static final int PROPERTY_mouseListeners = 85;
    private static final int PROPERTY_mouseMotionListeners = 86;
    private static final int PROPERTY_mousePosition = 87;
    private static final int PROPERTY_mouseWheelListeners = 88;
    private static final int PROPERTY_name = 89;
    private static final int PROPERTY_nextFocusableComponent = 90;
    private static final int PROPERTY_normalBounds = 91;
    private static final int PROPERTY_opaque = 92;
    private static final int PROPERTY_optimizedDrawingEnabled = 93;
    private static final int PROPERTY_paintingForPrint = 94;
    private static final int PROPERTY_paintingTile = 95;
    private static final int PROPERTY_parent = 96;
    private static final int PROPERTY_peer = 97;
    private static final int PROPERTY_preferredSize = 98;
    private static final int PROPERTY_preferredSizeSet = 99;
    private static final int PROPERTY_propertyChangeListeners = 100;
    private static final int PROPERTY_registeredKeyStrokes = 101;
    private static final int PROPERTY_requestFocusEnabled = 102;
    private static final int PROPERTY_resizable = 103;
    private static final int PROPERTY_rootPane = 104;
    private static final int PROPERTY_selected = 105;
    private static final int PROPERTY_showing = 106;
    private static final int PROPERTY_size = 107;
    private static final int PROPERTY_title = 108;
    private static final int PROPERTY_toolkit = 109;
    private static final int PROPERTY_toolTipText = 110;
    private static final int PROPERTY_topLevelAncestor = 111;
    private static final int PROPERTY_transferHandler = 112;
    private static final int PROPERTY_treeLock = 113;
    private static final int PROPERTY_UI = 114;
    private static final int PROPERTY_UIClassID = 115;
    private static final int PROPERTY_valid = 116;
    private static final int PROPERTY_validateRoot = 117;
    private static final int PROPERTY_verifyInputWhenFocusTarget = 118;
    private static final int PROPERTY_vetoableChangeListeners = 119;
    private static final int PROPERTY_view = 120;
    private static final int PROPERTY_viewBean = 121;
    private static final int PROPERTY_visible = 122;
    private static final int PROPERTY_visibleRect = 123;
    private static final int PROPERTY_warningString = 124;
    private static final int PROPERTY_width = 125;
    private static final int PROPERTY_x = 126;
    private static final int PROPERTY_y = 127;

    // Property array 
    /*lazy PropertyDescriptor*/
    private static PropertyDescriptor[] getPdescriptor(){
        PropertyDescriptor[] properties = new PropertyDescriptor[128];
    
        try {
            properties[PROPERTY_accessibleContext] = new PropertyDescriptor ( "accessibleContext", br.com.gmp.desktop.views.ViewFrame.class, "getAccessibleContext", null ); // NOI18N
            properties[PROPERTY_actionMap] = new PropertyDescriptor ( "actionMap", br.com.gmp.desktop.views.ViewFrame.class, "getActionMap", "setActionMap" ); // NOI18N
            properties[PROPERTY_alignmentX] = new PropertyDescriptor ( "alignmentX", br.com.gmp.desktop.views.ViewFrame.class, "getAlignmentX", "setAlignmentX" ); // NOI18N
            properties[PROPERTY_alignmentY] = new PropertyDescriptor ( "alignmentY", br.com.gmp.desktop.views.ViewFrame.class, "getAlignmentY", "setAlignmentY" ); // NOI18N
            properties[PROPERTY_ancestorListeners] = new PropertyDescriptor ( "ancestorListeners", br.com.gmp.desktop.views.ViewFrame.class, "getAncestorListeners", null ); // NOI18N
            properties[PROPERTY_autoscrolls] = new PropertyDescriptor ( "autoscrolls", br.com.gmp.desktop.views.ViewFrame.class, "getAutoscrolls", "setAutoscrolls" ); // NOI18N
            properties[PROPERTY_background] = new PropertyDescriptor ( "background", br.com.gmp.desktop.views.ViewFrame.class, "getBackground", "setBackground" ); // NOI18N
            properties[PROPERTY_background].setPreferred ( true );
            properties[PROPERTY_backgroundSet] = new PropertyDescriptor ( "backgroundSet", br.com.gmp.desktop.views.ViewFrame.class, "isBackgroundSet", null ); // NOI18N
            properties[PROPERTY_baselineResizeBehavior] = new PropertyDescriptor ( "baselineResizeBehavior", br.com.gmp.desktop.views.ViewFrame.class, "getBaselineResizeBehavior", null ); // NOI18N
            properties[PROPERTY_border] = new PropertyDescriptor ( "border", br.com.gmp.desktop.views.ViewFrame.class, "getBorder", "setBorder" ); // NOI18N
            properties[PROPERTY_border].setPreferred ( true );
            properties[PROPERTY_bounds] = new PropertyDescriptor ( "bounds", br.com.gmp.desktop.views.ViewFrame.class, "getBounds", "setBounds" ); // NOI18N
            properties[PROPERTY_closable] = new PropertyDescriptor ( "closable", br.com.gmp.desktop.views.ViewFrame.class, "isClosable", "setClosable" ); // NOI18N
            properties[PROPERTY_closable].setPreferred ( true );
            properties[PROPERTY_closed] = new PropertyDescriptor ( "closed", br.com.gmp.desktop.views.ViewFrame.class, "isClosed", "setClosed" ); // NOI18N
            properties[PROPERTY_colorModel] = new PropertyDescriptor ( "colorModel", br.com.gmp.desktop.views.ViewFrame.class, "getColorModel", null ); // NOI18N
            properties[PROPERTY_component] = new IndexedPropertyDescriptor ( "component", br.com.gmp.desktop.views.ViewFrame.class, null, null, "getComponent", null ); // NOI18N
            properties[PROPERTY_componentCount] = new PropertyDescriptor ( "componentCount", br.com.gmp.desktop.views.ViewFrame.class, "getComponentCount", null ); // NOI18N
            properties[PROPERTY_componentListeners] = new PropertyDescriptor ( "componentListeners", br.com.gmp.desktop.views.ViewFrame.class, "getComponentListeners", null ); // NOI18N
            properties[PROPERTY_componentOrientation] = new PropertyDescriptor ( "componentOrientation", br.com.gmp.desktop.views.ViewFrame.class, "getComponentOrientation", "setComponentOrientation" ); // NOI18N
            properties[PROPERTY_componentPopupMenu] = new PropertyDescriptor ( "componentPopupMenu", br.com.gmp.desktop.views.ViewFrame.class, "getComponentPopupMenu", "setComponentPopupMenu" ); // NOI18N
            properties[PROPERTY_components] = new PropertyDescriptor ( "components", br.com.gmp.desktop.views.ViewFrame.class, "getComponents", null ); // NOI18N
            properties[PROPERTY_containerListeners] = new PropertyDescriptor ( "containerListeners", br.com.gmp.desktop.views.ViewFrame.class, "getContainerListeners", null ); // NOI18N
            properties[PROPERTY_contentPane] = new PropertyDescriptor ( "contentPane", br.com.gmp.desktop.views.ViewFrame.class, "getContentPane", "setContentPane" ); // NOI18N
            properties[PROPERTY_cursor] = new PropertyDescriptor ( "cursor", br.com.gmp.desktop.views.ViewFrame.class, "getCursor", "setCursor" ); // NOI18N
            properties[PROPERTY_cursorSet] = new PropertyDescriptor ( "cursorSet", br.com.gmp.desktop.views.ViewFrame.class, "isCursorSet", null ); // NOI18N
            properties[PROPERTY_debugGraphicsOptions] = new PropertyDescriptor ( "debugGraphicsOptions", br.com.gmp.desktop.views.ViewFrame.class, "getDebugGraphicsOptions", "setDebugGraphicsOptions" ); // NOI18N
            properties[PROPERTY_defaultCloseOperation] = new PropertyDescriptor ( "defaultCloseOperation", br.com.gmp.desktop.views.ViewFrame.class, "getDefaultCloseOperation", "setDefaultCloseOperation" ); // NOI18N
            properties[PROPERTY_desktopIcon] = new PropertyDescriptor ( "desktopIcon", br.com.gmp.desktop.views.ViewFrame.class, "getDesktopIcon", "setDesktopIcon" ); // NOI18N
            properties[PROPERTY_desktopPane] = new PropertyDescriptor ( "desktopPane", br.com.gmp.desktop.views.ViewFrame.class, "getDesktopPane", null ); // NOI18N
            properties[PROPERTY_displayable] = new PropertyDescriptor ( "displayable", br.com.gmp.desktop.views.ViewFrame.class, "isDisplayable", null ); // NOI18N
            properties[PROPERTY_doubleBuffered] = new PropertyDescriptor ( "doubleBuffered", br.com.gmp.desktop.views.ViewFrame.class, "isDoubleBuffered", "setDoubleBuffered" ); // NOI18N
            properties[PROPERTY_dropTarget] = new PropertyDescriptor ( "dropTarget", br.com.gmp.desktop.views.ViewFrame.class, "getDropTarget", "setDropTarget" ); // NOI18N
            properties[PROPERTY_enabled] = new PropertyDescriptor ( "enabled", br.com.gmp.desktop.views.ViewFrame.class, "isEnabled", "setEnabled" ); // NOI18N
            properties[PROPERTY_focusable] = new PropertyDescriptor ( "focusable", br.com.gmp.desktop.views.ViewFrame.class, "isFocusable", "setFocusable" ); // NOI18N
            properties[PROPERTY_focusCycleRoot] = new PropertyDescriptor ( "focusCycleRoot", br.com.gmp.desktop.views.ViewFrame.class, "isFocusCycleRoot", "setFocusCycleRoot" ); // NOI18N
            properties[PROPERTY_focusCycleRootAncestor] = new PropertyDescriptor ( "focusCycleRootAncestor", br.com.gmp.desktop.views.ViewFrame.class, "getFocusCycleRootAncestor", null ); // NOI18N
            properties[PROPERTY_focusListeners] = new PropertyDescriptor ( "focusListeners", br.com.gmp.desktop.views.ViewFrame.class, "getFocusListeners", null ); // NOI18N
            properties[PROPERTY_focusOwner] = new PropertyDescriptor ( "focusOwner", br.com.gmp.desktop.views.ViewFrame.class, "getFocusOwner", null ); // NOI18N
            properties[PROPERTY_focusTraversable] = new PropertyDescriptor ( "focusTraversable", br.com.gmp.desktop.views.ViewFrame.class, "isFocusTraversable", null ); // NOI18N
            properties[PROPERTY_focusTraversalKeys] = new IndexedPropertyDescriptor ( "focusTraversalKeys", br.com.gmp.desktop.views.ViewFrame.class, null, null, null, "setFocusTraversalKeys" ); // NOI18N
            properties[PROPERTY_focusTraversalKeysEnabled] = new PropertyDescriptor ( "focusTraversalKeysEnabled", br.com.gmp.desktop.views.ViewFrame.class, "getFocusTraversalKeysEnabled", "setFocusTraversalKeysEnabled" ); // NOI18N
            properties[PROPERTY_focusTraversalPolicy] = new PropertyDescriptor ( "focusTraversalPolicy", br.com.gmp.desktop.views.ViewFrame.class, "getFocusTraversalPolicy", "setFocusTraversalPolicy" ); // NOI18N
            properties[PROPERTY_focusTraversalPolicyProvider] = new PropertyDescriptor ( "focusTraversalPolicyProvider", br.com.gmp.desktop.views.ViewFrame.class, "isFocusTraversalPolicyProvider", "setFocusTraversalPolicyProvider" ); // NOI18N
            properties[PROPERTY_focusTraversalPolicySet] = new PropertyDescriptor ( "focusTraversalPolicySet", br.com.gmp.desktop.views.ViewFrame.class, "isFocusTraversalPolicySet", null ); // NOI18N
            properties[PROPERTY_font] = new PropertyDescriptor ( "font", br.com.gmp.desktop.views.ViewFrame.class, "getFont", "setFont" ); // NOI18N
            properties[PROPERTY_fontSet] = new PropertyDescriptor ( "fontSet", br.com.gmp.desktop.views.ViewFrame.class, "isFontSet", null ); // NOI18N
            properties[PROPERTY_foreground] = new PropertyDescriptor ( "foreground", br.com.gmp.desktop.views.ViewFrame.class, "getForeground", "setForeground" ); // NOI18N
            properties[PROPERTY_foregroundSet] = new PropertyDescriptor ( "foregroundSet", br.com.gmp.desktop.views.ViewFrame.class, "isForegroundSet", null ); // NOI18N
            properties[PROPERTY_frameIcon] = new PropertyDescriptor ( "frameIcon", br.com.gmp.desktop.views.ViewFrame.class, "getFrameIcon", "setFrameIcon" ); // NOI18N
            properties[PROPERTY_glassPane] = new PropertyDescriptor ( "glassPane", br.com.gmp.desktop.views.ViewFrame.class, "getGlassPane", "setGlassPane" ); // NOI18N
            properties[PROPERTY_graphics] = new PropertyDescriptor ( "graphics", br.com.gmp.desktop.views.ViewFrame.class, "getGraphics", null ); // NOI18N
            properties[PROPERTY_graphicsConfiguration] = new PropertyDescriptor ( "graphicsConfiguration", br.com.gmp.desktop.views.ViewFrame.class, "getGraphicsConfiguration", null ); // NOI18N
            properties[PROPERTY_height] = new PropertyDescriptor ( "height", br.com.gmp.desktop.views.ViewFrame.class, "getHeight", null ); // NOI18N
            properties[PROPERTY_hierarchyBoundsListeners] = new PropertyDescriptor ( "hierarchyBoundsListeners", br.com.gmp.desktop.views.ViewFrame.class, "getHierarchyBoundsListeners", null ); // NOI18N
            properties[PROPERTY_hierarchyListeners] = new PropertyDescriptor ( "hierarchyListeners", br.com.gmp.desktop.views.ViewFrame.class, "getHierarchyListeners", null ); // NOI18N
            properties[PROPERTY_icon] = new PropertyDescriptor ( "icon", br.com.gmp.desktop.views.ViewFrame.class, "isIcon", "setIcon" ); // NOI18N
            properties[PROPERTY_icon].setPreferred ( true );
            properties[PROPERTY_iconifiable] = new PropertyDescriptor ( "iconifiable", br.com.gmp.desktop.views.ViewFrame.class, "isIconifiable", "setIconifiable" ); // NOI18N
            properties[PROPERTY_iconifiable].setPreferred ( true );
            properties[PROPERTY_ignoreRepaint] = new PropertyDescriptor ( "ignoreRepaint", br.com.gmp.desktop.views.ViewFrame.class, "getIgnoreRepaint", "setIgnoreRepaint" ); // NOI18N
            properties[PROPERTY_inheritsPopupMenu] = new PropertyDescriptor ( "inheritsPopupMenu", br.com.gmp.desktop.views.ViewFrame.class, "getInheritsPopupMenu", "setInheritsPopupMenu" ); // NOI18N
            properties[PROPERTY_inputContext] = new PropertyDescriptor ( "inputContext", br.com.gmp.desktop.views.ViewFrame.class, "getInputContext", null ); // NOI18N
            properties[PROPERTY_inputMap] = new PropertyDescriptor ( "inputMap", br.com.gmp.desktop.views.ViewFrame.class, "getInputMap", null ); // NOI18N
            properties[PROPERTY_inputMethodListeners] = new PropertyDescriptor ( "inputMethodListeners", br.com.gmp.desktop.views.ViewFrame.class, "getInputMethodListeners", null ); // NOI18N
            properties[PROPERTY_inputMethodRequests] = new PropertyDescriptor ( "inputMethodRequests", br.com.gmp.desktop.views.ViewFrame.class, "getInputMethodRequests", null ); // NOI18N
            properties[PROPERTY_inputVerifier] = new PropertyDescriptor ( "inputVerifier", br.com.gmp.desktop.views.ViewFrame.class, "getInputVerifier", "setInputVerifier" ); // NOI18N
            properties[PROPERTY_insets] = new PropertyDescriptor ( "insets", br.com.gmp.desktop.views.ViewFrame.class, "getInsets", null ); // NOI18N
            properties[PROPERTY_internalFrameListeners] = new PropertyDescriptor ( "internalFrameListeners", br.com.gmp.desktop.views.ViewFrame.class, "getInternalFrameListeners", null ); // NOI18N
            properties[PROPERTY_JMenuBar] = new PropertyDescriptor ( "JMenuBar", br.com.gmp.desktop.views.ViewFrame.class, "getJMenuBar", "setJMenuBar" ); // NOI18N
            properties[PROPERTY_keyListeners] = new PropertyDescriptor ( "keyListeners", br.com.gmp.desktop.views.ViewFrame.class, "getKeyListeners", null ); // NOI18N
            properties[PROPERTY_lastCursor] = new PropertyDescriptor ( "lastCursor", br.com.gmp.desktop.views.ViewFrame.class, "getLastCursor", null ); // NOI18N
            properties[PROPERTY_layer] = new PropertyDescriptor ( "layer", br.com.gmp.desktop.views.ViewFrame.class, "getLayer", "setLayer" ); // NOI18N
            properties[PROPERTY_layer].setPreferred ( true );
            properties[PROPERTY_layeredPane] = new PropertyDescriptor ( "layeredPane", br.com.gmp.desktop.views.ViewFrame.class, "getLayeredPane", "setLayeredPane" ); // NOI18N
            properties[PROPERTY_layout] = new PropertyDescriptor ( "layout", br.com.gmp.desktop.views.ViewFrame.class, "getLayout", "setLayout" ); // NOI18N
            properties[PROPERTY_level] = new PropertyDescriptor ( "level", br.com.gmp.desktop.views.ViewFrame.class, "getLevel", "setLevel" ); // NOI18N
            properties[PROPERTY_level].setPreferred ( true );
            properties[PROPERTY_level].setShortDescription ( "Nivel minimo de acesso para abrir a tela" );
            properties[PROPERTY_lightweight] = new PropertyDescriptor ( "lightweight", br.com.gmp.desktop.views.ViewFrame.class, "isLightweight", null ); // NOI18N
            properties[PROPERTY_locale] = new PropertyDescriptor ( "locale", br.com.gmp.desktop.views.ViewFrame.class, "getLocale", "setLocale" ); // NOI18N
            properties[PROPERTY_location] = new PropertyDescriptor ( "location", br.com.gmp.desktop.views.ViewFrame.class, "getLocation", "setLocation" ); // NOI18N
            properties[PROPERTY_locationOnScreen] = new PropertyDescriptor ( "locationOnScreen", br.com.gmp.desktop.views.ViewFrame.class, "getLocationOnScreen", null ); // NOI18N
            properties[PROPERTY_managingFocus] = new PropertyDescriptor ( "managingFocus", br.com.gmp.desktop.views.ViewFrame.class, "isManagingFocus", null ); // NOI18N
            properties[PROPERTY_maximizable] = new PropertyDescriptor ( "maximizable", br.com.gmp.desktop.views.ViewFrame.class, "isMaximizable", "setMaximizable" ); // NOI18N
            properties[PROPERTY_maximizable].setPreferred ( true );
            properties[PROPERTY_maximum] = new PropertyDescriptor ( "maximum", br.com.gmp.desktop.views.ViewFrame.class, "isMaximum", "setMaximum" ); // NOI18N
            properties[PROPERTY_maximumSize] = new PropertyDescriptor ( "maximumSize", br.com.gmp.desktop.views.ViewFrame.class, "getMaximumSize", "setMaximumSize" ); // NOI18N
            properties[PROPERTY_maximumSizeSet] = new PropertyDescriptor ( "maximumSizeSet", br.com.gmp.desktop.views.ViewFrame.class, "isMaximumSizeSet", null ); // NOI18N
            properties[PROPERTY_menuBar] = new PropertyDescriptor ( "menuBar", br.com.gmp.desktop.views.ViewFrame.class, "getMenuBar", "setMenuBar" ); // NOI18N
            properties[PROPERTY_minimumSize] = new PropertyDescriptor ( "minimumSize", br.com.gmp.desktop.views.ViewFrame.class, "getMinimumSize", "setMinimumSize" ); // NOI18N
            properties[PROPERTY_minimumSizeSet] = new PropertyDescriptor ( "minimumSizeSet", br.com.gmp.desktop.views.ViewFrame.class, "isMinimumSizeSet", null ); // NOI18N
            properties[PROPERTY_mostRecentFocusOwner] = new PropertyDescriptor ( "mostRecentFocusOwner", br.com.gmp.desktop.views.ViewFrame.class, "getMostRecentFocusOwner", null ); // NOI18N
            properties[PROPERTY_mouseListeners] = new PropertyDescriptor ( "mouseListeners", br.com.gmp.desktop.views.ViewFrame.class, "getMouseListeners", null ); // NOI18N
            properties[PROPERTY_mouseMotionListeners] = new PropertyDescriptor ( "mouseMotionListeners", br.com.gmp.desktop.views.ViewFrame.class, "getMouseMotionListeners", null ); // NOI18N
            properties[PROPERTY_mousePosition] = new PropertyDescriptor ( "mousePosition", br.com.gmp.desktop.views.ViewFrame.class, "getMousePosition", null ); // NOI18N
            properties[PROPERTY_mouseWheelListeners] = new PropertyDescriptor ( "mouseWheelListeners", br.com.gmp.desktop.views.ViewFrame.class, "getMouseWheelListeners", null ); // NOI18N
            properties[PROPERTY_name] = new PropertyDescriptor ( "name", br.com.gmp.desktop.views.ViewFrame.class, "getName", "setName" ); // NOI18N
            properties[PROPERTY_nextFocusableComponent] = new PropertyDescriptor ( "nextFocusableComponent", br.com.gmp.desktop.views.ViewFrame.class, "getNextFocusableComponent", "setNextFocusableComponent" ); // NOI18N
            properties[PROPERTY_normalBounds] = new PropertyDescriptor ( "normalBounds", br.com.gmp.desktop.views.ViewFrame.class, "getNormalBounds", "setNormalBounds" ); // NOI18N
            properties[PROPERTY_opaque] = new PropertyDescriptor ( "opaque", br.com.gmp.desktop.views.ViewFrame.class, "isOpaque", "setOpaque" ); // NOI18N
            properties[PROPERTY_optimizedDrawingEnabled] = new PropertyDescriptor ( "optimizedDrawingEnabled", br.com.gmp.desktop.views.ViewFrame.class, "isOptimizedDrawingEnabled", null ); // NOI18N
            properties[PROPERTY_paintingForPrint] = new PropertyDescriptor ( "paintingForPrint", br.com.gmp.desktop.views.ViewFrame.class, "isPaintingForPrint", null ); // NOI18N
            properties[PROPERTY_paintingTile] = new PropertyDescriptor ( "paintingTile", br.com.gmp.desktop.views.ViewFrame.class, "isPaintingTile", null ); // NOI18N
            properties[PROPERTY_parent] = new PropertyDescriptor ( "parent", br.com.gmp.desktop.views.ViewFrame.class, "getParent", null ); // NOI18N
            properties[PROPERTY_peer] = new PropertyDescriptor ( "peer", br.com.gmp.desktop.views.ViewFrame.class, "getPeer", null ); // NOI18N
            properties[PROPERTY_preferredSize] = new PropertyDescriptor ( "preferredSize", br.com.gmp.desktop.views.ViewFrame.class, "getPreferredSize", "setPreferredSize" ); // NOI18N
            properties[PROPERTY_preferredSizeSet] = new PropertyDescriptor ( "preferredSizeSet", br.com.gmp.desktop.views.ViewFrame.class, "isPreferredSizeSet", null ); // NOI18N
            properties[PROPERTY_propertyChangeListeners] = new PropertyDescriptor ( "propertyChangeListeners", br.com.gmp.desktop.views.ViewFrame.class, "getPropertyChangeListeners", null ); // NOI18N
            properties[PROPERTY_registeredKeyStrokes] = new PropertyDescriptor ( "registeredKeyStrokes", br.com.gmp.desktop.views.ViewFrame.class, "getRegisteredKeyStrokes", null ); // NOI18N
            properties[PROPERTY_requestFocusEnabled] = new PropertyDescriptor ( "requestFocusEnabled", br.com.gmp.desktop.views.ViewFrame.class, "isRequestFocusEnabled", "setRequestFocusEnabled" ); // NOI18N
            properties[PROPERTY_resizable] = new PropertyDescriptor ( "resizable", br.com.gmp.desktop.views.ViewFrame.class, "isResizable", "setResizable" ); // NOI18N
            properties[PROPERTY_resizable].setPreferred ( true );
            properties[PROPERTY_rootPane] = new PropertyDescriptor ( "rootPane", br.com.gmp.desktop.views.ViewFrame.class, "getRootPane", null ); // NOI18N
            properties[PROPERTY_selected] = new PropertyDescriptor ( "selected", br.com.gmp.desktop.views.ViewFrame.class, "isSelected", "setSelected" ); // NOI18N
            properties[PROPERTY_showing] = new PropertyDescriptor ( "showing", br.com.gmp.desktop.views.ViewFrame.class, "isShowing", null ); // NOI18N
            properties[PROPERTY_size] = new PropertyDescriptor ( "size", br.com.gmp.desktop.views.ViewFrame.class, "getSize", "setSize" ); // NOI18N
            properties[PROPERTY_title] = new PropertyDescriptor ( "title", br.com.gmp.desktop.views.ViewFrame.class, "getTitle", "setTitle" ); // NOI18N
            properties[PROPERTY_title].setPreferred ( true );
            properties[PROPERTY_toolkit] = new PropertyDescriptor ( "toolkit", br.com.gmp.desktop.views.ViewFrame.class, "getToolkit", null ); // NOI18N
            properties[PROPERTY_toolTipText] = new PropertyDescriptor ( "toolTipText", br.com.gmp.desktop.views.ViewFrame.class, "getToolTipText", "setToolTipText" ); // NOI18N
            properties[PROPERTY_topLevelAncestor] = new PropertyDescriptor ( "topLevelAncestor", br.com.gmp.desktop.views.ViewFrame.class, "getTopLevelAncestor", null ); // NOI18N
            properties[PROPERTY_transferHandler] = new PropertyDescriptor ( "transferHandler", br.com.gmp.desktop.views.ViewFrame.class, "getTransferHandler", "setTransferHandler" ); // NOI18N
            properties[PROPERTY_treeLock] = new PropertyDescriptor ( "treeLock", br.com.gmp.desktop.views.ViewFrame.class, "getTreeLock", null ); // NOI18N
            properties[PROPERTY_UI] = new PropertyDescriptor ( "UI", br.com.gmp.desktop.views.ViewFrame.class, "getUI", "setUI" ); // NOI18N
            properties[PROPERTY_UIClassID] = new PropertyDescriptor ( "UIClassID", br.com.gmp.desktop.views.ViewFrame.class, "getUIClassID", null ); // NOI18N
            properties[PROPERTY_valid] = new PropertyDescriptor ( "valid", br.com.gmp.desktop.views.ViewFrame.class, "isValid", null ); // NOI18N
            properties[PROPERTY_validateRoot] = new PropertyDescriptor ( "validateRoot", br.com.gmp.desktop.views.ViewFrame.class, "isValidateRoot", null ); // NOI18N
            properties[PROPERTY_verifyInputWhenFocusTarget] = new PropertyDescriptor ( "verifyInputWhenFocusTarget", br.com.gmp.desktop.views.ViewFrame.class, "getVerifyInputWhenFocusTarget", "setVerifyInputWhenFocusTarget" ); // NOI18N
            properties[PROPERTY_vetoableChangeListeners] = new PropertyDescriptor ( "vetoableChangeListeners", br.com.gmp.desktop.views.ViewFrame.class, "getVetoableChangeListeners", null ); // NOI18N
            properties[PROPERTY_view] = new PropertyDescriptor ( "view", br.com.gmp.desktop.views.ViewFrame.class, "getView", null ); // NOI18N
            properties[PROPERTY_viewBean] = new PropertyDescriptor ( "viewBean", br.com.gmp.desktop.views.ViewFrame.class, "getViewBean", null ); // NOI18N
            properties[PROPERTY_viewBean].setPreferred ( true );
            properties[PROPERTY_visible] = new PropertyDescriptor ( "visible", br.com.gmp.desktop.views.ViewFrame.class, "isVisible", "setVisible" ); // NOI18N
            properties[PROPERTY_visible].setPreferred ( true );
            properties[PROPERTY_visibleRect] = new PropertyDescriptor ( "visibleRect", br.com.gmp.desktop.views.ViewFrame.class, "getVisibleRect", null ); // NOI18N
            properties[PROPERTY_warningString] = new PropertyDescriptor ( "warningString", br.com.gmp.desktop.views.ViewFrame.class, "getWarningString", null ); // NOI18N
            properties[PROPERTY_width] = new PropertyDescriptor ( "width", br.com.gmp.desktop.views.ViewFrame.class, "getWidth", null ); // NOI18N
            properties[PROPERTY_x] = new PropertyDescriptor ( "x", br.com.gmp.desktop.views.ViewFrame.class, "getX", null ); // NOI18N
            properties[PROPERTY_y] = new PropertyDescriptor ( "y", br.com.gmp.desktop.views.ViewFrame.class, "getY", null ); // NOI18N
        }
        catch(IntrospectionException e) {
            e.printStackTrace();
        }//GEN-HEADEREND:Properties
    // Here you can add code for customizing the properties array.

        return properties;     }//GEN-LAST:Properties

    // EventSet identifiers//GEN-FIRST:Events
    private static final int EVENT_ancestorListener = 0;
    private static final int EVENT_componentListener = 1;
    private static final int EVENT_containerListener = 2;
    private static final int EVENT_focusListener = 3;
    private static final int EVENT_hierarchyBoundsListener = 4;
    private static final int EVENT_hierarchyListener = 5;
    private static final int EVENT_inputMethodListener = 6;
    private static final int EVENT_internalFrameListener = 7;
    private static final int EVENT_keyListener = 8;
    private static final int EVENT_mouseListener = 9;
    private static final int EVENT_mouseMotionListener = 10;
    private static final int EVENT_mouseWheelListener = 11;
    private static final int EVENT_propertyChangeListener = 12;
    private static final int EVENT_vetoableChangeListener = 13;

    // EventSet array
    /*lazy EventSetDescriptor*/
    private static EventSetDescriptor[] getEdescriptor(){
        EventSetDescriptor[] eventSets = new EventSetDescriptor[14];
    
        try {
            eventSets[EVENT_ancestorListener] = new EventSetDescriptor ( br.com.gmp.desktop.views.ViewFrame.class, "ancestorListener", javax.swing.event.AncestorListener.class, new String[] {"ancestorAdded", "ancestorRemoved", "ancestorMoved"}, "addAncestorListener", "removeAncestorListener" ); // NOI18N
            eventSets[EVENT_componentListener] = new EventSetDescriptor ( br.com.gmp.desktop.views.ViewFrame.class, "componentListener", java.awt.event.ComponentListener.class, new String[] {"componentResized", "componentMoved", "componentShown", "componentHidden"}, "addComponentListener", "removeComponentListener" ); // NOI18N
            eventSets[EVENT_containerListener] = new EventSetDescriptor ( br.com.gmp.desktop.views.ViewFrame.class, "containerListener", java.awt.event.ContainerListener.class, new String[] {"componentAdded", "componentRemoved"}, "addContainerListener", "removeContainerListener" ); // NOI18N
            eventSets[EVENT_focusListener] = new EventSetDescriptor ( br.com.gmp.desktop.views.ViewFrame.class, "focusListener", java.awt.event.FocusListener.class, new String[] {"focusGained", "focusLost"}, "addFocusListener", "removeFocusListener" ); // NOI18N
            eventSets[EVENT_hierarchyBoundsListener] = new EventSetDescriptor ( br.com.gmp.desktop.views.ViewFrame.class, "hierarchyBoundsListener", java.awt.event.HierarchyBoundsListener.class, new String[] {"ancestorMoved", "ancestorResized"}, "addHierarchyBoundsListener", "removeHierarchyBoundsListener" ); // NOI18N
            eventSets[EVENT_hierarchyListener] = new EventSetDescriptor ( br.com.gmp.desktop.views.ViewFrame.class, "hierarchyListener", java.awt.event.HierarchyListener.class, new String[] {"hierarchyChanged"}, "addHierarchyListener", "removeHierarchyListener" ); // NOI18N
            eventSets[EVENT_inputMethodListener] = new EventSetDescriptor ( br.com.gmp.desktop.views.ViewFrame.class, "inputMethodListener", java.awt.event.InputMethodListener.class, new String[] {"inputMethodTextChanged", "caretPositionChanged"}, "addInputMethodListener", "removeInputMethodListener" ); // NOI18N
            eventSets[EVENT_internalFrameListener] = new EventSetDescriptor ( br.com.gmp.desktop.views.ViewFrame.class, "internalFrameListener", javax.swing.event.InternalFrameListener.class, new String[] {"internalFrameOpened", "internalFrameClosing", "internalFrameClosed", "internalFrameIconified", "internalFrameDeiconified", "internalFrameActivated", "internalFrameDeactivated"}, "addInternalFrameListener", "removeInternalFrameListener" ); // NOI18N
            eventSets[EVENT_keyListener] = new EventSetDescriptor ( br.com.gmp.desktop.views.ViewFrame.class, "keyListener", java.awt.event.KeyListener.class, new String[] {"keyTyped", "keyPressed", "keyReleased"}, "addKeyListener", "removeKeyListener" ); // NOI18N
            eventSets[EVENT_mouseListener] = new EventSetDescriptor ( br.com.gmp.desktop.views.ViewFrame.class, "mouseListener", java.awt.event.MouseListener.class, new String[] {"mouseClicked", "mousePressed", "mouseReleased", "mouseEntered", "mouseExited"}, "addMouseListener", "removeMouseListener" ); // NOI18N
            eventSets[EVENT_mouseMotionListener] = new EventSetDescriptor ( br.com.gmp.desktop.views.ViewFrame.class, "mouseMotionListener", java.awt.event.MouseMotionListener.class, new String[] {"mouseDragged", "mouseMoved"}, "addMouseMotionListener", "removeMouseMotionListener" ); // NOI18N
            eventSets[EVENT_mouseWheelListener] = new EventSetDescriptor ( br.com.gmp.desktop.views.ViewFrame.class, "mouseWheelListener", java.awt.event.MouseWheelListener.class, new String[] {"mouseWheelMoved"}, "addMouseWheelListener", "removeMouseWheelListener" ); // NOI18N
            eventSets[EVENT_propertyChangeListener] = new EventSetDescriptor ( br.com.gmp.desktop.views.ViewFrame.class, "propertyChangeListener", java.beans.PropertyChangeListener.class, new String[] {"propertyChange"}, "addPropertyChangeListener", "removePropertyChangeListener" ); // NOI18N
            eventSets[EVENT_vetoableChangeListener] = new EventSetDescriptor ( br.com.gmp.desktop.views.ViewFrame.class, "vetoableChangeListener", java.beans.VetoableChangeListener.class, new String[] {"vetoableChange"}, "addVetoableChangeListener", "removeVetoableChangeListener" ); // NOI18N
        }
        catch(IntrospectionException e) {
            e.printStackTrace();
        }//GEN-HEADEREND:Events
    // Here you can add code for customizing the event sets array.

        return eventSets;     }//GEN-LAST:Events

    // Method identifiers//GEN-FIRST:Methods
    private static final int METHOD_action0 = 0;
    private static final int METHOD_add1 = 1;
    private static final int METHOD_add2 = 2;
    private static final int METHOD_add3 = 3;
    private static final int METHOD_add4 = 4;
    private static final int METHOD_add5 = 5;
    private static final int METHOD_add6 = 6;
    private static final int METHOD_addNotify7 = 7;
    private static final int METHOD_addPropertyChangeListener8 = 8;
    private static final int METHOD_applyComponentOrientation9 = 9;
    private static final int METHOD_areFocusTraversalKeysSet10 = 10;
    private static final int METHOD_bounds11 = 11;
    private static final int METHOD_canClean12 = 12;
    private static final int METHOD_canConfirm13 = 13;
    private static final int METHOD_canDiscard14 = 14;
    private static final int METHOD_canLoad15 = 15;
    private static final int METHOD_canProcess16 = 16;
    private static final int METHOD_canReload17 = 17;
    private static final int METHOD_checkImage18 = 18;
    private static final int METHOD_checkImage19 = 19;
    private static final int METHOD_clean20 = 20;
    private static final int METHOD_computeVisibleRect21 = 21;
    private static final int METHOD_confirm22 = 22;
    private static final int METHOD_contains23 = 23;
    private static final int METHOD_contains24 = 24;
    private static final int METHOD_countComponents25 = 25;
    private static final int METHOD_createImage26 = 26;
    private static final int METHOD_createImage27 = 27;
    private static final int METHOD_createToolTip28 = 28;
    private static final int METHOD_createVolatileImage29 = 29;
    private static final int METHOD_createVolatileImage30 = 30;
    private static final int METHOD_deliverEvent31 = 31;
    private static final int METHOD_disable32 = 32;
    private static final int METHOD_discard33 = 33;
    private static final int METHOD_dispatchEvent34 = 34;
    private static final int METHOD_dispose35 = 35;
    private static final int METHOD_doDefaultCloseAction36 = 36;
    private static final int METHOD_doLayout37 = 37;
    private static final int METHOD_enable38 = 38;
    private static final int METHOD_enable39 = 39;
    private static final int METHOD_enableInputMethods40 = 40;
    private static final int METHOD_findComponentAt41 = 41;
    private static final int METHOD_findComponentAt42 = 42;
    private static final int METHOD_firePropertyChange43 = 43;
    private static final int METHOD_firePropertyChange44 = 44;
    private static final int METHOD_firePropertyChange45 = 45;
    private static final int METHOD_firePropertyChange46 = 46;
    private static final int METHOD_firePropertyChange47 = 47;
    private static final int METHOD_firePropertyChange48 = 48;
    private static final int METHOD_firePropertyChange49 = 49;
    private static final int METHOD_firePropertyChange50 = 50;
    private static final int METHOD_getActionForKeyStroke51 = 51;
    private static final int METHOD_getBaseline52 = 52;
    private static final int METHOD_getBounds53 = 53;
    private static final int METHOD_getClientProperty54 = 54;
    private static final int METHOD_getComponentAt55 = 55;
    private static final int METHOD_getComponentAt56 = 56;
    private static final int METHOD_getComponentZOrder57 = 57;
    private static final int METHOD_getConditionForKeyStroke58 = 58;
    private static final int METHOD_getDefaultLocale59 = 59;
    private static final int METHOD_getFocusTraversalKeys60 = 60;
    private static final int METHOD_getFontMetrics61 = 61;
    private static final int METHOD_getInsets62 = 62;
    private static final int METHOD_getListeners63 = 63;
    private static final int METHOD_getLocation64 = 64;
    private static final int METHOD_getMousePosition65 = 65;
    private static final int METHOD_getPopupLocation66 = 66;
    private static final int METHOD_getPropertyChangeListeners67 = 67;
    private static final int METHOD_getSize68 = 68;
    private static final int METHOD_getToolTipLocation69 = 69;
    private static final int METHOD_getToolTipText70 = 70;
    private static final int METHOD_gotFocus71 = 71;
    private static final int METHOD_grabFocus72 = 72;
    private static final int METHOD_handleEvent73 = 73;
    private static final int METHOD_hasFocus74 = 74;
    private static final int METHOD_hide75 = 75;
    private static final int METHOD_imageUpdate76 = 76;
    private static final int METHOD_insets77 = 77;
    private static final int METHOD_inside78 = 78;
    private static final int METHOD_invalidate79 = 79;
    private static final int METHOD_isAncestorOf80 = 80;
    private static final int METHOD_isFocusCycleRoot81 = 81;
    private static final int METHOD_isFocusOwner82 = 82;
    private static final int METHOD_isLightweightComponent83 = 83;
    private static final int METHOD_keyDown84 = 84;
    private static final int METHOD_keyUp85 = 85;
    private static final int METHOD_layout86 = 86;
    private static final int METHOD_list87 = 87;
    private static final int METHOD_list88 = 88;
    private static final int METHOD_list89 = 89;
    private static final int METHOD_list90 = 90;
    private static final int METHOD_list91 = 91;
    private static final int METHOD_load92 = 92;
    private static final int METHOD_locate93 = 93;
    private static final int METHOD_location94 = 94;
    private static final int METHOD_lostFocus95 = 95;
    private static final int METHOD_minimumSize96 = 96;
    private static final int METHOD_mouseDown97 = 97;
    private static final int METHOD_mouseDrag98 = 98;
    private static final int METHOD_mouseEnter99 = 99;
    private static final int METHOD_mouseExit100 = 100;
    private static final int METHOD_mouseMove101 = 101;
    private static final int METHOD_mouseUp102 = 102;
    private static final int METHOD_move103 = 103;
    private static final int METHOD_moveToBack104 = 104;
    private static final int METHOD_moveToFront105 = 105;
    private static final int METHOD_nextFocus106 = 106;
    private static final int METHOD_pack107 = 107;
    private static final int METHOD_paint108 = 108;
    private static final int METHOD_paintAll109 = 109;
    private static final int METHOD_paintComponents110 = 110;
    private static final int METHOD_paintImmediately111 = 111;
    private static final int METHOD_paintImmediately112 = 112;
    private static final int METHOD_postEvent113 = 113;
    private static final int METHOD_preferredSize114 = 114;
    private static final int METHOD_prepareImage115 = 115;
    private static final int METHOD_prepareImage116 = 116;
    private static final int METHOD_print117 = 117;
    private static final int METHOD_printAll118 = 118;
    private static final int METHOD_printComponents119 = 119;
    private static final int METHOD_process120 = 120;
    private static final int METHOD_putClientProperty121 = 121;
    private static final int METHOD_registerKeyboardAction122 = 122;
    private static final int METHOD_registerKeyboardAction123 = 123;
    private static final int METHOD_reload124 = 124;
    private static final int METHOD_remove125 = 125;
    private static final int METHOD_remove126 = 126;
    private static final int METHOD_remove127 = 127;
    private static final int METHOD_removeAll128 = 128;
    private static final int METHOD_removeNotify129 = 129;
    private static final int METHOD_removePropertyChangeListener130 = 130;
    private static final int METHOD_repaint131 = 131;
    private static final int METHOD_repaint132 = 132;
    private static final int METHOD_repaint133 = 133;
    private static final int METHOD_repaint134 = 134;
    private static final int METHOD_repaint135 = 135;
    private static final int METHOD_requestDefaultFocus136 = 136;
    private static final int METHOD_requestFocus137 = 137;
    private static final int METHOD_requestFocus138 = 138;
    private static final int METHOD_requestFocusInWindow139 = 139;
    private static final int METHOD_resetKeyboardActions140 = 140;
    private static final int METHOD_reshape141 = 141;
    private static final int METHOD_resize142 = 142;
    private static final int METHOD_resize143 = 143;
    private static final int METHOD_restoreSubcomponentFocus144 = 144;
    private static final int METHOD_revalidate145 = 145;
    private static final int METHOD_scrollRectToVisible146 = 146;
    private static final int METHOD_setBounds147 = 147;
    private static final int METHOD_setComponentZOrder148 = 148;
    private static final int METHOD_setDefaultLocale149 = 149;
    private static final int METHOD_setLayer150 = 150;
    private static final int METHOD_show151 = 151;
    private static final int METHOD_show152 = 152;
    private static final int METHOD_size153 = 153;
    private static final int METHOD_toBack154 = 154;
    private static final int METHOD_toFront155 = 155;
    private static final int METHOD_toString156 = 156;
    private static final int METHOD_transferFocus157 = 157;
    private static final int METHOD_transferFocusBackward158 = 158;
    private static final int METHOD_transferFocusDownCycle159 = 159;
    private static final int METHOD_transferFocusUpCycle160 = 160;
    private static final int METHOD_unregisterKeyboardAction161 = 161;
    private static final int METHOD_update162 = 162;
    private static final int METHOD_updateUI163 = 163;
    private static final int METHOD_validate164 = 164;
    private static final int METHOD_validateView165 = 165;

    // Method array 
    /*lazy MethodDescriptor*/
    private static MethodDescriptor[] getMdescriptor(){
        MethodDescriptor[] methods = new MethodDescriptor[166];
    
        try {
            methods[METHOD_action0] = new MethodDescriptor(java.awt.Component.class.getMethod("action", new Class[] {java.awt.Event.class, java.lang.Object.class})); // NOI18N
            methods[METHOD_action0].setDisplayName ( "" );
            methods[METHOD_add1] = new MethodDescriptor(java.awt.Component.class.getMethod("add", new Class[] {java.awt.PopupMenu.class})); // NOI18N
            methods[METHOD_add1].setDisplayName ( "" );
            methods[METHOD_add2] = new MethodDescriptor(java.awt.Container.class.getMethod("add", new Class[] {java.awt.Component.class})); // NOI18N
            methods[METHOD_add2].setDisplayName ( "" );
            methods[METHOD_add3] = new MethodDescriptor(java.awt.Container.class.getMethod("add", new Class[] {java.lang.String.class, java.awt.Component.class})); // NOI18N
            methods[METHOD_add3].setDisplayName ( "" );
            methods[METHOD_add4] = new MethodDescriptor(java.awt.Container.class.getMethod("add", new Class[] {java.awt.Component.class, int.class})); // NOI18N
            methods[METHOD_add4].setDisplayName ( "" );
            methods[METHOD_add5] = new MethodDescriptor(java.awt.Container.class.getMethod("add", new Class[] {java.awt.Component.class, java.lang.Object.class})); // NOI18N
            methods[METHOD_add5].setDisplayName ( "" );
            methods[METHOD_add6] = new MethodDescriptor(java.awt.Container.class.getMethod("add", new Class[] {java.awt.Component.class, java.lang.Object.class, int.class})); // NOI18N
            methods[METHOD_add6].setDisplayName ( "" );
            methods[METHOD_addNotify7] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("addNotify", new Class[] {})); // NOI18N
            methods[METHOD_addNotify7].setDisplayName ( "" );
            methods[METHOD_addPropertyChangeListener8] = new MethodDescriptor(java.awt.Container.class.getMethod("addPropertyChangeListener", new Class[] {java.lang.String.class, java.beans.PropertyChangeListener.class})); // NOI18N
            methods[METHOD_addPropertyChangeListener8].setDisplayName ( "" );
            methods[METHOD_applyComponentOrientation9] = new MethodDescriptor(java.awt.Container.class.getMethod("applyComponentOrientation", new Class[] {java.awt.ComponentOrientation.class})); // NOI18N
            methods[METHOD_applyComponentOrientation9].setDisplayName ( "" );
            methods[METHOD_areFocusTraversalKeysSet10] = new MethodDescriptor(java.awt.Container.class.getMethod("areFocusTraversalKeysSet", new Class[] {int.class})); // NOI18N
            methods[METHOD_areFocusTraversalKeysSet10].setDisplayName ( "" );
            methods[METHOD_bounds11] = new MethodDescriptor(java.awt.Component.class.getMethod("bounds", new Class[] {})); // NOI18N
            methods[METHOD_bounds11].setDisplayName ( "" );
            methods[METHOD_canClean12] = new MethodDescriptor(br.com.gmp.desktop.views.ViewFrame.class.getMethod("canClean", new Class[] {})); // NOI18N
            methods[METHOD_canClean12].setDisplayName ( "" );
            methods[METHOD_canConfirm13] = new MethodDescriptor(br.com.gmp.desktop.views.ViewFrame.class.getMethod("canConfirm", new Class[] {})); // NOI18N
            methods[METHOD_canConfirm13].setDisplayName ( "" );
            methods[METHOD_canDiscard14] = new MethodDescriptor(br.com.gmp.desktop.views.ViewFrame.class.getMethod("canDiscard", new Class[] {})); // NOI18N
            methods[METHOD_canDiscard14].setDisplayName ( "" );
            methods[METHOD_canLoad15] = new MethodDescriptor(br.com.gmp.desktop.views.ViewFrame.class.getMethod("canLoad", new Class[] {})); // NOI18N
            methods[METHOD_canLoad15].setDisplayName ( "" );
            methods[METHOD_canProcess16] = new MethodDescriptor(br.com.gmp.desktop.views.ViewFrame.class.getMethod("canProcess", new Class[] {})); // NOI18N
            methods[METHOD_canProcess16].setDisplayName ( "" );
            methods[METHOD_canReload17] = new MethodDescriptor(br.com.gmp.desktop.views.ViewFrame.class.getMethod("canReload", new Class[] {})); // NOI18N
            methods[METHOD_canReload17].setDisplayName ( "" );
            methods[METHOD_checkImage18] = new MethodDescriptor(java.awt.Component.class.getMethod("checkImage", new Class[] {java.awt.Image.class, java.awt.image.ImageObserver.class})); // NOI18N
            methods[METHOD_checkImage18].setDisplayName ( "" );
            methods[METHOD_checkImage19] = new MethodDescriptor(java.awt.Component.class.getMethod("checkImage", new Class[] {java.awt.Image.class, int.class, int.class, java.awt.image.ImageObserver.class})); // NOI18N
            methods[METHOD_checkImage19].setDisplayName ( "" );
            methods[METHOD_clean20] = new MethodDescriptor(br.com.gmp.desktop.views.ViewFrame.class.getMethod("clean", new Class[] {})); // NOI18N
            methods[METHOD_clean20].setDisplayName ( "" );
            methods[METHOD_computeVisibleRect21] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("computeVisibleRect", new Class[] {java.awt.Rectangle.class})); // NOI18N
            methods[METHOD_computeVisibleRect21].setDisplayName ( "" );
            methods[METHOD_confirm22] = new MethodDescriptor(br.com.gmp.desktop.views.ViewFrame.class.getMethod("confirm", new Class[] {})); // NOI18N
            methods[METHOD_confirm22].setDisplayName ( "" );
            methods[METHOD_contains23] = new MethodDescriptor(java.awt.Component.class.getMethod("contains", new Class[] {java.awt.Point.class})); // NOI18N
            methods[METHOD_contains23].setDisplayName ( "" );
            methods[METHOD_contains24] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("contains", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_contains24].setDisplayName ( "" );
            methods[METHOD_countComponents25] = new MethodDescriptor(java.awt.Container.class.getMethod("countComponents", new Class[] {})); // NOI18N
            methods[METHOD_countComponents25].setDisplayName ( "" );
            methods[METHOD_createImage26] = new MethodDescriptor(java.awt.Component.class.getMethod("createImage", new Class[] {java.awt.image.ImageProducer.class})); // NOI18N
            methods[METHOD_createImage26].setDisplayName ( "" );
            methods[METHOD_createImage27] = new MethodDescriptor(java.awt.Component.class.getMethod("createImage", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_createImage27].setDisplayName ( "" );
            methods[METHOD_createToolTip28] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("createToolTip", new Class[] {})); // NOI18N
            methods[METHOD_createToolTip28].setDisplayName ( "" );
            methods[METHOD_createVolatileImage29] = new MethodDescriptor(java.awt.Component.class.getMethod("createVolatileImage", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_createVolatileImage29].setDisplayName ( "" );
            methods[METHOD_createVolatileImage30] = new MethodDescriptor(java.awt.Component.class.getMethod("createVolatileImage", new Class[] {int.class, int.class, java.awt.ImageCapabilities.class})); // NOI18N
            methods[METHOD_createVolatileImage30].setDisplayName ( "" );
            methods[METHOD_deliverEvent31] = new MethodDescriptor(java.awt.Container.class.getMethod("deliverEvent", new Class[] {java.awt.Event.class})); // NOI18N
            methods[METHOD_deliverEvent31].setDisplayName ( "" );
            methods[METHOD_disable32] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("disable", new Class[] {})); // NOI18N
            methods[METHOD_disable32].setDisplayName ( "" );
            methods[METHOD_discard33] = new MethodDescriptor(br.com.gmp.desktop.views.ViewFrame.class.getMethod("discard", new Class[] {})); // NOI18N
            methods[METHOD_discard33].setDisplayName ( "" );
            methods[METHOD_dispatchEvent34] = new MethodDescriptor(java.awt.Component.class.getMethod("dispatchEvent", new Class[] {java.awt.AWTEvent.class})); // NOI18N
            methods[METHOD_dispatchEvent34].setDisplayName ( "" );
            methods[METHOD_dispose35] = new MethodDescriptor(javax.swing.JInternalFrame.class.getMethod("dispose", new Class[] {})); // NOI18N
            methods[METHOD_dispose35].setDisplayName ( "" );
            methods[METHOD_doDefaultCloseAction36] = new MethodDescriptor(javax.swing.JInternalFrame.class.getMethod("doDefaultCloseAction", new Class[] {})); // NOI18N
            methods[METHOD_doDefaultCloseAction36].setDisplayName ( "" );
            methods[METHOD_doLayout37] = new MethodDescriptor(java.awt.Container.class.getMethod("doLayout", new Class[] {})); // NOI18N
            methods[METHOD_doLayout37].setDisplayName ( "" );
            methods[METHOD_enable38] = new MethodDescriptor(java.awt.Component.class.getMethod("enable", new Class[] {boolean.class})); // NOI18N
            methods[METHOD_enable38].setDisplayName ( "" );
            methods[METHOD_enable39] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("enable", new Class[] {})); // NOI18N
            methods[METHOD_enable39].setDisplayName ( "" );
            methods[METHOD_enableInputMethods40] = new MethodDescriptor(java.awt.Component.class.getMethod("enableInputMethods", new Class[] {boolean.class})); // NOI18N
            methods[METHOD_enableInputMethods40].setDisplayName ( "" );
            methods[METHOD_findComponentAt41] = new MethodDescriptor(java.awt.Container.class.getMethod("findComponentAt", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_findComponentAt41].setDisplayName ( "" );
            methods[METHOD_findComponentAt42] = new MethodDescriptor(java.awt.Container.class.getMethod("findComponentAt", new Class[] {java.awt.Point.class})); // NOI18N
            methods[METHOD_findComponentAt42].setDisplayName ( "" );
            methods[METHOD_firePropertyChange43] = new MethodDescriptor(java.awt.Component.class.getMethod("firePropertyChange", new Class[] {java.lang.String.class, byte.class, byte.class})); // NOI18N
            methods[METHOD_firePropertyChange43].setDisplayName ( "" );
            methods[METHOD_firePropertyChange44] = new MethodDescriptor(java.awt.Component.class.getMethod("firePropertyChange", new Class[] {java.lang.String.class, short.class, short.class})); // NOI18N
            methods[METHOD_firePropertyChange44].setDisplayName ( "" );
            methods[METHOD_firePropertyChange45] = new MethodDescriptor(java.awt.Component.class.getMethod("firePropertyChange", new Class[] {java.lang.String.class, long.class, long.class})); // NOI18N
            methods[METHOD_firePropertyChange45].setDisplayName ( "" );
            methods[METHOD_firePropertyChange46] = new MethodDescriptor(java.awt.Component.class.getMethod("firePropertyChange", new Class[] {java.lang.String.class, float.class, float.class})); // NOI18N
            methods[METHOD_firePropertyChange46].setDisplayName ( "" );
            methods[METHOD_firePropertyChange47] = new MethodDescriptor(java.awt.Component.class.getMethod("firePropertyChange", new Class[] {java.lang.String.class, double.class, double.class})); // NOI18N
            methods[METHOD_firePropertyChange47].setDisplayName ( "" );
            methods[METHOD_firePropertyChange48] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("firePropertyChange", new Class[] {java.lang.String.class, boolean.class, boolean.class})); // NOI18N
            methods[METHOD_firePropertyChange48].setDisplayName ( "" );
            methods[METHOD_firePropertyChange49] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("firePropertyChange", new Class[] {java.lang.String.class, int.class, int.class})); // NOI18N
            methods[METHOD_firePropertyChange49].setDisplayName ( "" );
            methods[METHOD_firePropertyChange50] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("firePropertyChange", new Class[] {java.lang.String.class, char.class, char.class})); // NOI18N
            methods[METHOD_firePropertyChange50].setDisplayName ( "" );
            methods[METHOD_getActionForKeyStroke51] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("getActionForKeyStroke", new Class[] {javax.swing.KeyStroke.class})); // NOI18N
            methods[METHOD_getActionForKeyStroke51].setDisplayName ( "" );
            methods[METHOD_getBaseline52] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("getBaseline", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_getBaseline52].setDisplayName ( "" );
            methods[METHOD_getBounds53] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("getBounds", new Class[] {java.awt.Rectangle.class})); // NOI18N
            methods[METHOD_getBounds53].setDisplayName ( "" );
            methods[METHOD_getClientProperty54] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("getClientProperty", new Class[] {java.lang.Object.class})); // NOI18N
            methods[METHOD_getClientProperty54].setDisplayName ( "" );
            methods[METHOD_getComponentAt55] = new MethodDescriptor(java.awt.Container.class.getMethod("getComponentAt", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_getComponentAt55].setDisplayName ( "" );
            methods[METHOD_getComponentAt56] = new MethodDescriptor(java.awt.Container.class.getMethod("getComponentAt", new Class[] {java.awt.Point.class})); // NOI18N
            methods[METHOD_getComponentAt56].setDisplayName ( "" );
            methods[METHOD_getComponentZOrder57] = new MethodDescriptor(java.awt.Container.class.getMethod("getComponentZOrder", new Class[] {java.awt.Component.class})); // NOI18N
            methods[METHOD_getComponentZOrder57].setDisplayName ( "" );
            methods[METHOD_getConditionForKeyStroke58] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("getConditionForKeyStroke", new Class[] {javax.swing.KeyStroke.class})); // NOI18N
            methods[METHOD_getConditionForKeyStroke58].setDisplayName ( "" );
            methods[METHOD_getDefaultLocale59] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("getDefaultLocale", new Class[] {})); // NOI18N
            methods[METHOD_getDefaultLocale59].setDisplayName ( "" );
            methods[METHOD_getFocusTraversalKeys60] = new MethodDescriptor(java.awt.Container.class.getMethod("getFocusTraversalKeys", new Class[] {int.class})); // NOI18N
            methods[METHOD_getFocusTraversalKeys60].setDisplayName ( "" );
            methods[METHOD_getFontMetrics61] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("getFontMetrics", new Class[] {java.awt.Font.class})); // NOI18N
            methods[METHOD_getFontMetrics61].setDisplayName ( "" );
            methods[METHOD_getInsets62] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("getInsets", new Class[] {java.awt.Insets.class})); // NOI18N
            methods[METHOD_getInsets62].setDisplayName ( "" );
            methods[METHOD_getListeners63] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("getListeners", new Class[] {java.lang.Class.class})); // NOI18N
            methods[METHOD_getListeners63].setDisplayName ( "" );
            methods[METHOD_getLocation64] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("getLocation", new Class[] {java.awt.Point.class})); // NOI18N
            methods[METHOD_getLocation64].setDisplayName ( "" );
            methods[METHOD_getMousePosition65] = new MethodDescriptor(java.awt.Container.class.getMethod("getMousePosition", new Class[] {boolean.class})); // NOI18N
            methods[METHOD_getMousePosition65].setDisplayName ( "" );
            methods[METHOD_getPopupLocation66] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("getPopupLocation", new Class[] {java.awt.event.MouseEvent.class})); // NOI18N
            methods[METHOD_getPopupLocation66].setDisplayName ( "" );
            methods[METHOD_getPropertyChangeListeners67] = new MethodDescriptor(java.awt.Component.class.getMethod("getPropertyChangeListeners", new Class[] {java.lang.String.class})); // NOI18N
            methods[METHOD_getPropertyChangeListeners67].setDisplayName ( "" );
            methods[METHOD_getSize68] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("getSize", new Class[] {java.awt.Dimension.class})); // NOI18N
            methods[METHOD_getSize68].setDisplayName ( "" );
            methods[METHOD_getToolTipLocation69] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("getToolTipLocation", new Class[] {java.awt.event.MouseEvent.class})); // NOI18N
            methods[METHOD_getToolTipLocation69].setDisplayName ( "" );
            methods[METHOD_getToolTipText70] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("getToolTipText", new Class[] {java.awt.event.MouseEvent.class})); // NOI18N
            methods[METHOD_getToolTipText70].setDisplayName ( "" );
            methods[METHOD_gotFocus71] = new MethodDescriptor(java.awt.Component.class.getMethod("gotFocus", new Class[] {java.awt.Event.class, java.lang.Object.class})); // NOI18N
            methods[METHOD_gotFocus71].setDisplayName ( "" );
            methods[METHOD_grabFocus72] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("grabFocus", new Class[] {})); // NOI18N
            methods[METHOD_grabFocus72].setDisplayName ( "" );
            methods[METHOD_handleEvent73] = new MethodDescriptor(java.awt.Component.class.getMethod("handleEvent", new Class[] {java.awt.Event.class})); // NOI18N
            methods[METHOD_handleEvent73].setDisplayName ( "" );
            methods[METHOD_hasFocus74] = new MethodDescriptor(java.awt.Component.class.getMethod("hasFocus", new Class[] {})); // NOI18N
            methods[METHOD_hasFocus74].setDisplayName ( "" );
            methods[METHOD_hide75] = new MethodDescriptor(javax.swing.JInternalFrame.class.getMethod("hide", new Class[] {})); // NOI18N
            methods[METHOD_hide75].setDisplayName ( "" );
            methods[METHOD_imageUpdate76] = new MethodDescriptor(java.awt.Component.class.getMethod("imageUpdate", new Class[] {java.awt.Image.class, int.class, int.class, int.class, int.class, int.class})); // NOI18N
            methods[METHOD_imageUpdate76].setDisplayName ( "" );
            methods[METHOD_insets77] = new MethodDescriptor(java.awt.Container.class.getMethod("insets", new Class[] {})); // NOI18N
            methods[METHOD_insets77].setDisplayName ( "" );
            methods[METHOD_inside78] = new MethodDescriptor(java.awt.Component.class.getMethod("inside", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_inside78].setDisplayName ( "" );
            methods[METHOD_invalidate79] = new MethodDescriptor(java.awt.Container.class.getMethod("invalidate", new Class[] {})); // NOI18N
            methods[METHOD_invalidate79].setDisplayName ( "" );
            methods[METHOD_isAncestorOf80] = new MethodDescriptor(java.awt.Container.class.getMethod("isAncestorOf", new Class[] {java.awt.Component.class})); // NOI18N
            methods[METHOD_isAncestorOf80].setDisplayName ( "" );
            methods[METHOD_isFocusCycleRoot81] = new MethodDescriptor(java.awt.Container.class.getMethod("isFocusCycleRoot", new Class[] {java.awt.Container.class})); // NOI18N
            methods[METHOD_isFocusCycleRoot81].setDisplayName ( "" );
            methods[METHOD_isFocusOwner82] = new MethodDescriptor(java.awt.Component.class.getMethod("isFocusOwner", new Class[] {})); // NOI18N
            methods[METHOD_isFocusOwner82].setDisplayName ( "" );
            methods[METHOD_isLightweightComponent83] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("isLightweightComponent", new Class[] {java.awt.Component.class})); // NOI18N
            methods[METHOD_isLightweightComponent83].setDisplayName ( "" );
            methods[METHOD_keyDown84] = new MethodDescriptor(java.awt.Component.class.getMethod("keyDown", new Class[] {java.awt.Event.class, int.class})); // NOI18N
            methods[METHOD_keyDown84].setDisplayName ( "" );
            methods[METHOD_keyUp85] = new MethodDescriptor(java.awt.Component.class.getMethod("keyUp", new Class[] {java.awt.Event.class, int.class})); // NOI18N
            methods[METHOD_keyUp85].setDisplayName ( "" );
            methods[METHOD_layout86] = new MethodDescriptor(java.awt.Container.class.getMethod("layout", new Class[] {})); // NOI18N
            methods[METHOD_layout86].setDisplayName ( "" );
            methods[METHOD_list87] = new MethodDescriptor(java.awt.Component.class.getMethod("list", new Class[] {})); // NOI18N
            methods[METHOD_list87].setDisplayName ( "" );
            methods[METHOD_list88] = new MethodDescriptor(java.awt.Component.class.getMethod("list", new Class[] {java.io.PrintStream.class})); // NOI18N
            methods[METHOD_list88].setDisplayName ( "" );
            methods[METHOD_list89] = new MethodDescriptor(java.awt.Component.class.getMethod("list", new Class[] {java.io.PrintWriter.class})); // NOI18N
            methods[METHOD_list89].setDisplayName ( "" );
            methods[METHOD_list90] = new MethodDescriptor(java.awt.Container.class.getMethod("list", new Class[] {java.io.PrintStream.class, int.class})); // NOI18N
            methods[METHOD_list90].setDisplayName ( "" );
            methods[METHOD_list91] = new MethodDescriptor(java.awt.Container.class.getMethod("list", new Class[] {java.io.PrintWriter.class, int.class})); // NOI18N
            methods[METHOD_list91].setDisplayName ( "" );
            methods[METHOD_load92] = new MethodDescriptor(br.com.gmp.desktop.views.ViewFrame.class.getMethod("load", new Class[] {})); // NOI18N
            methods[METHOD_load92].setDisplayName ( "" );
            methods[METHOD_locate93] = new MethodDescriptor(java.awt.Container.class.getMethod("locate", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_locate93].setDisplayName ( "" );
            methods[METHOD_location94] = new MethodDescriptor(java.awt.Component.class.getMethod("location", new Class[] {})); // NOI18N
            methods[METHOD_location94].setDisplayName ( "" );
            methods[METHOD_lostFocus95] = new MethodDescriptor(java.awt.Component.class.getMethod("lostFocus", new Class[] {java.awt.Event.class, java.lang.Object.class})); // NOI18N
            methods[METHOD_lostFocus95].setDisplayName ( "" );
            methods[METHOD_minimumSize96] = new MethodDescriptor(java.awt.Container.class.getMethod("minimumSize", new Class[] {})); // NOI18N
            methods[METHOD_minimumSize96].setDisplayName ( "" );
            methods[METHOD_mouseDown97] = new MethodDescriptor(java.awt.Component.class.getMethod("mouseDown", new Class[] {java.awt.Event.class, int.class, int.class})); // NOI18N
            methods[METHOD_mouseDown97].setDisplayName ( "" );
            methods[METHOD_mouseDrag98] = new MethodDescriptor(java.awt.Component.class.getMethod("mouseDrag", new Class[] {java.awt.Event.class, int.class, int.class})); // NOI18N
            methods[METHOD_mouseDrag98].setDisplayName ( "" );
            methods[METHOD_mouseEnter99] = new MethodDescriptor(java.awt.Component.class.getMethod("mouseEnter", new Class[] {java.awt.Event.class, int.class, int.class})); // NOI18N
            methods[METHOD_mouseEnter99].setDisplayName ( "" );
            methods[METHOD_mouseExit100] = new MethodDescriptor(java.awt.Component.class.getMethod("mouseExit", new Class[] {java.awt.Event.class, int.class, int.class})); // NOI18N
            methods[METHOD_mouseExit100].setDisplayName ( "" );
            methods[METHOD_mouseMove101] = new MethodDescriptor(java.awt.Component.class.getMethod("mouseMove", new Class[] {java.awt.Event.class, int.class, int.class})); // NOI18N
            methods[METHOD_mouseMove101].setDisplayName ( "" );
            methods[METHOD_mouseUp102] = new MethodDescriptor(java.awt.Component.class.getMethod("mouseUp", new Class[] {java.awt.Event.class, int.class, int.class})); // NOI18N
            methods[METHOD_mouseUp102].setDisplayName ( "" );
            methods[METHOD_move103] = new MethodDescriptor(java.awt.Component.class.getMethod("move", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_move103].setDisplayName ( "" );
            methods[METHOD_moveToBack104] = new MethodDescriptor(javax.swing.JInternalFrame.class.getMethod("moveToBack", new Class[] {})); // NOI18N
            methods[METHOD_moveToBack104].setDisplayName ( "" );
            methods[METHOD_moveToFront105] = new MethodDescriptor(javax.swing.JInternalFrame.class.getMethod("moveToFront", new Class[] {})); // NOI18N
            methods[METHOD_moveToFront105].setDisplayName ( "" );
            methods[METHOD_nextFocus106] = new MethodDescriptor(java.awt.Component.class.getMethod("nextFocus", new Class[] {})); // NOI18N
            methods[METHOD_nextFocus106].setDisplayName ( "" );
            methods[METHOD_pack107] = new MethodDescriptor(javax.swing.JInternalFrame.class.getMethod("pack", new Class[] {})); // NOI18N
            methods[METHOD_pack107].setDisplayName ( "" );
            methods[METHOD_paint108] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("paint", new Class[] {java.awt.Graphics.class})); // NOI18N
            methods[METHOD_paint108].setDisplayName ( "" );
            methods[METHOD_paintAll109] = new MethodDescriptor(java.awt.Component.class.getMethod("paintAll", new Class[] {java.awt.Graphics.class})); // NOI18N
            methods[METHOD_paintAll109].setDisplayName ( "" );
            methods[METHOD_paintComponents110] = new MethodDescriptor(java.awt.Container.class.getMethod("paintComponents", new Class[] {java.awt.Graphics.class})); // NOI18N
            methods[METHOD_paintComponents110].setDisplayName ( "" );
            methods[METHOD_paintImmediately111] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("paintImmediately", new Class[] {int.class, int.class, int.class, int.class})); // NOI18N
            methods[METHOD_paintImmediately111].setDisplayName ( "" );
            methods[METHOD_paintImmediately112] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("paintImmediately", new Class[] {java.awt.Rectangle.class})); // NOI18N
            methods[METHOD_paintImmediately112].setDisplayName ( "" );
            methods[METHOD_postEvent113] = new MethodDescriptor(java.awt.Component.class.getMethod("postEvent", new Class[] {java.awt.Event.class})); // NOI18N
            methods[METHOD_postEvent113].setDisplayName ( "" );
            methods[METHOD_preferredSize114] = new MethodDescriptor(java.awt.Container.class.getMethod("preferredSize", new Class[] {})); // NOI18N
            methods[METHOD_preferredSize114].setDisplayName ( "" );
            methods[METHOD_prepareImage115] = new MethodDescriptor(java.awt.Component.class.getMethod("prepareImage", new Class[] {java.awt.Image.class, java.awt.image.ImageObserver.class})); // NOI18N
            methods[METHOD_prepareImage115].setDisplayName ( "" );
            methods[METHOD_prepareImage116] = new MethodDescriptor(java.awt.Component.class.getMethod("prepareImage", new Class[] {java.awt.Image.class, int.class, int.class, java.awt.image.ImageObserver.class})); // NOI18N
            methods[METHOD_prepareImage116].setDisplayName ( "" );
            methods[METHOD_print117] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("print", new Class[] {java.awt.Graphics.class})); // NOI18N
            methods[METHOD_print117].setDisplayName ( "" );
            methods[METHOD_printAll118] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("printAll", new Class[] {java.awt.Graphics.class})); // NOI18N
            methods[METHOD_printAll118].setDisplayName ( "" );
            methods[METHOD_printComponents119] = new MethodDescriptor(java.awt.Container.class.getMethod("printComponents", new Class[] {java.awt.Graphics.class})); // NOI18N
            methods[METHOD_printComponents119].setDisplayName ( "" );
            methods[METHOD_process120] = new MethodDescriptor(br.com.gmp.desktop.views.ViewFrame.class.getMethod("process", new Class[] {})); // NOI18N
            methods[METHOD_process120].setDisplayName ( "" );
            methods[METHOD_putClientProperty121] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("putClientProperty", new Class[] {java.lang.Object.class, java.lang.Object.class})); // NOI18N
            methods[METHOD_putClientProperty121].setDisplayName ( "" );
            methods[METHOD_registerKeyboardAction122] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("registerKeyboardAction", new Class[] {java.awt.event.ActionListener.class, java.lang.String.class, javax.swing.KeyStroke.class, int.class})); // NOI18N
            methods[METHOD_registerKeyboardAction122].setDisplayName ( "" );
            methods[METHOD_registerKeyboardAction123] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("registerKeyboardAction", new Class[] {java.awt.event.ActionListener.class, javax.swing.KeyStroke.class, int.class})); // NOI18N
            methods[METHOD_registerKeyboardAction123].setDisplayName ( "" );
            methods[METHOD_reload124] = new MethodDescriptor(br.com.gmp.desktop.views.ViewFrame.class.getMethod("reload", new Class[] {})); // NOI18N
            methods[METHOD_reload124].setDisplayName ( "" );
            methods[METHOD_remove125] = new MethodDescriptor(java.awt.Component.class.getMethod("remove", new Class[] {java.awt.MenuComponent.class})); // NOI18N
            methods[METHOD_remove125].setDisplayName ( "" );
            methods[METHOD_remove126] = new MethodDescriptor(java.awt.Container.class.getMethod("remove", new Class[] {int.class})); // NOI18N
            methods[METHOD_remove126].setDisplayName ( "" );
            methods[METHOD_remove127] = new MethodDescriptor(javax.swing.JInternalFrame.class.getMethod("remove", new Class[] {java.awt.Component.class})); // NOI18N
            methods[METHOD_remove127].setDisplayName ( "" );
            methods[METHOD_removeAll128] = new MethodDescriptor(java.awt.Container.class.getMethod("removeAll", new Class[] {})); // NOI18N
            methods[METHOD_removeAll128].setDisplayName ( "" );
            methods[METHOD_removeNotify129] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("removeNotify", new Class[] {})); // NOI18N
            methods[METHOD_removeNotify129].setDisplayName ( "" );
            methods[METHOD_removePropertyChangeListener130] = new MethodDescriptor(java.awt.Component.class.getMethod("removePropertyChangeListener", new Class[] {java.lang.String.class, java.beans.PropertyChangeListener.class})); // NOI18N
            methods[METHOD_removePropertyChangeListener130].setDisplayName ( "" );
            methods[METHOD_repaint131] = new MethodDescriptor(java.awt.Component.class.getMethod("repaint", new Class[] {})); // NOI18N
            methods[METHOD_repaint131].setDisplayName ( "" );
            methods[METHOD_repaint132] = new MethodDescriptor(java.awt.Component.class.getMethod("repaint", new Class[] {long.class})); // NOI18N
            methods[METHOD_repaint132].setDisplayName ( "" );
            methods[METHOD_repaint133] = new MethodDescriptor(java.awt.Component.class.getMethod("repaint", new Class[] {int.class, int.class, int.class, int.class})); // NOI18N
            methods[METHOD_repaint133].setDisplayName ( "" );
            methods[METHOD_repaint134] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("repaint", new Class[] {long.class, int.class, int.class, int.class, int.class})); // NOI18N
            methods[METHOD_repaint134].setDisplayName ( "" );
            methods[METHOD_repaint135] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("repaint", new Class[] {java.awt.Rectangle.class})); // NOI18N
            methods[METHOD_repaint135].setDisplayName ( "" );
            methods[METHOD_requestDefaultFocus136] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("requestDefaultFocus", new Class[] {})); // NOI18N
            methods[METHOD_requestDefaultFocus136].setDisplayName ( "" );
            methods[METHOD_requestFocus137] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("requestFocus", new Class[] {})); // NOI18N
            methods[METHOD_requestFocus137].setDisplayName ( "" );
            methods[METHOD_requestFocus138] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("requestFocus", new Class[] {boolean.class})); // NOI18N
            methods[METHOD_requestFocus138].setDisplayName ( "" );
            methods[METHOD_requestFocusInWindow139] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("requestFocusInWindow", new Class[] {})); // NOI18N
            methods[METHOD_requestFocusInWindow139].setDisplayName ( "" );
            methods[METHOD_resetKeyboardActions140] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("resetKeyboardActions", new Class[] {})); // NOI18N
            methods[METHOD_resetKeyboardActions140].setDisplayName ( "" );
            methods[METHOD_reshape141] = new MethodDescriptor(javax.swing.JInternalFrame.class.getMethod("reshape", new Class[] {int.class, int.class, int.class, int.class})); // NOI18N
            methods[METHOD_reshape141].setDisplayName ( "" );
            methods[METHOD_resize142] = new MethodDescriptor(java.awt.Component.class.getMethod("resize", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_resize142].setDisplayName ( "" );
            methods[METHOD_resize143] = new MethodDescriptor(java.awt.Component.class.getMethod("resize", new Class[] {java.awt.Dimension.class})); // NOI18N
            methods[METHOD_resize143].setDisplayName ( "" );
            methods[METHOD_restoreSubcomponentFocus144] = new MethodDescriptor(javax.swing.JInternalFrame.class.getMethod("restoreSubcomponentFocus", new Class[] {})); // NOI18N
            methods[METHOD_restoreSubcomponentFocus144].setDisplayName ( "" );
            methods[METHOD_revalidate145] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("revalidate", new Class[] {})); // NOI18N
            methods[METHOD_revalidate145].setDisplayName ( "" );
            methods[METHOD_scrollRectToVisible146] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("scrollRectToVisible", new Class[] {java.awt.Rectangle.class})); // NOI18N
            methods[METHOD_scrollRectToVisible146].setDisplayName ( "" );
            methods[METHOD_setBounds147] = new MethodDescriptor(java.awt.Component.class.getMethod("setBounds", new Class[] {int.class, int.class, int.class, int.class})); // NOI18N
            methods[METHOD_setBounds147].setDisplayName ( "" );
            methods[METHOD_setComponentZOrder148] = new MethodDescriptor(java.awt.Container.class.getMethod("setComponentZOrder", new Class[] {java.awt.Component.class, int.class})); // NOI18N
            methods[METHOD_setComponentZOrder148].setDisplayName ( "" );
            methods[METHOD_setDefaultLocale149] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("setDefaultLocale", new Class[] {java.util.Locale.class})); // NOI18N
            methods[METHOD_setDefaultLocale149].setDisplayName ( "" );
            methods[METHOD_setLayer150] = new MethodDescriptor(javax.swing.JInternalFrame.class.getMethod("setLayer", new Class[] {java.lang.Integer.class})); // NOI18N
            methods[METHOD_setLayer150].setDisplayName ( "" );
            methods[METHOD_show151] = new MethodDescriptor(java.awt.Component.class.getMethod("show", new Class[] {boolean.class})); // NOI18N
            methods[METHOD_show151].setDisplayName ( "" );
            methods[METHOD_show152] = new MethodDescriptor(javax.swing.JInternalFrame.class.getMethod("show", new Class[] {})); // NOI18N
            methods[METHOD_show152].setDisplayName ( "" );
            methods[METHOD_size153] = new MethodDescriptor(java.awt.Component.class.getMethod("size", new Class[] {})); // NOI18N
            methods[METHOD_size153].setDisplayName ( "" );
            methods[METHOD_toBack154] = new MethodDescriptor(javax.swing.JInternalFrame.class.getMethod("toBack", new Class[] {})); // NOI18N
            methods[METHOD_toBack154].setDisplayName ( "" );
            methods[METHOD_toFront155] = new MethodDescriptor(javax.swing.JInternalFrame.class.getMethod("toFront", new Class[] {})); // NOI18N
            methods[METHOD_toFront155].setDisplayName ( "" );
            methods[METHOD_toString156] = new MethodDescriptor(java.awt.Component.class.getMethod("toString", new Class[] {})); // NOI18N
            methods[METHOD_toString156].setDisplayName ( "" );
            methods[METHOD_transferFocus157] = new MethodDescriptor(java.awt.Component.class.getMethod("transferFocus", new Class[] {})); // NOI18N
            methods[METHOD_transferFocus157].setDisplayName ( "" );
            methods[METHOD_transferFocusBackward158] = new MethodDescriptor(java.awt.Component.class.getMethod("transferFocusBackward", new Class[] {})); // NOI18N
            methods[METHOD_transferFocusBackward158].setDisplayName ( "" );
            methods[METHOD_transferFocusDownCycle159] = new MethodDescriptor(java.awt.Container.class.getMethod("transferFocusDownCycle", new Class[] {})); // NOI18N
            methods[METHOD_transferFocusDownCycle159].setDisplayName ( "" );
            methods[METHOD_transferFocusUpCycle160] = new MethodDescriptor(java.awt.Component.class.getMethod("transferFocusUpCycle", new Class[] {})); // NOI18N
            methods[METHOD_transferFocusUpCycle160].setDisplayName ( "" );
            methods[METHOD_unregisterKeyboardAction161] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("unregisterKeyboardAction", new Class[] {javax.swing.KeyStroke.class})); // NOI18N
            methods[METHOD_unregisterKeyboardAction161].setDisplayName ( "" );
            methods[METHOD_update162] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("update", new Class[] {java.awt.Graphics.class})); // NOI18N
            methods[METHOD_update162].setDisplayName ( "" );
            methods[METHOD_updateUI163] = new MethodDescriptor(javax.swing.JInternalFrame.class.getMethod("updateUI", new Class[] {})); // NOI18N
            methods[METHOD_updateUI163].setDisplayName ( "" );
            methods[METHOD_validate164] = new MethodDescriptor(java.awt.Container.class.getMethod("validate", new Class[] {})); // NOI18N
            methods[METHOD_validate164].setDisplayName ( "" );
            methods[METHOD_validateView165] = new MethodDescriptor(br.com.gmp.desktop.views.ViewFrame.class.getMethod("validateView", new Class[] {})); // NOI18N
            methods[METHOD_validateView165].setDisplayName ( "" );
        }
        catch( Exception e) {}//GEN-HEADEREND:Methods
    // Here you can add code for customizing the methods array.

        return methods;     }//GEN-LAST:Methods

    private static java.awt.Image iconColor16 = null;//GEN-BEGIN:IconsDef
    private static java.awt.Image iconColor32 = null;
    private static java.awt.Image iconMono16 = null;
    private static java.awt.Image iconMono32 = null;//GEN-END:IconsDef
    private static String iconNameC16 = "/IKONS/16/browser.png";//GEN-BEGIN:Icons
    private static String iconNameC32 = "/IKONS/32/browser.png";
    private static String iconNameM16 = "/IKONS/16/browser.png";
    private static String iconNameM32 = "/IKONS/32/browser.png";//GEN-END:Icons

    private static final int defaultPropertyIndex = -1;//GEN-BEGIN:Idx
    private static final int defaultEventIndex = -1;//GEN-END:Idx


//GEN-FIRST:Superclass
    // Here you can add code for customizing the Superclass BeanInfo.

//GEN-LAST:Superclass
    /**
     * Gets the bean's <code>BeanDescriptor</code>s.
     *
     * @return BeanDescriptor describing the editable properties of this bean.
     * May return null if the information should be obtained by automatic
     * analysis.
     */
    @Override
    public BeanDescriptor getBeanDescriptor() {
        return getBdescriptor();
    }

    /**
     * Gets the bean's <code>PropertyDescriptor</code>s.
     *
     * @return An array of PropertyDescriptors describing the editable
     * properties supported by this bean. May return null if the information
     * should be obtained by automatic analysis.
     * <p>
     * If a property is indexed, then its entry in the result array will belong
     * to the IndexedPropertyDescriptor subclass of PropertyDescriptor. A client
     * of getPropertyDescriptors can use "instanceof" to check if a given
     * PropertyDescriptor is an IndexedPropertyDescriptor.
     */
    @Override
    public PropertyDescriptor[] getPropertyDescriptors() {
        return getPdescriptor();
    }

    /**
     * Gets the bean's <code>EventSetDescriptor</code>s.
     *
     * @return An array of EventSetDescriptors describing the kinds of events
     * fired by this bean. May return null if the information should be obtained
     * by automatic analysis.
     */
    @Override
    public EventSetDescriptor[] getEventSetDescriptors() {
        return getEdescriptor();
    }

    /**
     * Gets the bean's <code>MethodDescriptor</code>s.
     *
     * @return An array of MethodDescriptors describing the methods implemented
     * by this bean. May return null if the information should be obtained by
     * automatic analysis.
     */
    @Override
    public MethodDescriptor[] getMethodDescriptors() {
        return getMdescriptor();
    }

    /**
     * A bean may have a "default" property that is the property that will
     * mostly commonly be initially chosen for update by human's who are
     * customizing the bean.
     *
     * @return Index of default property in the PropertyDescriptor array
     * returned by getPropertyDescriptors.
     * <P>
     * Returns -1 if there is no default property.
     */
    @Override
    public int getDefaultPropertyIndex() {
        return defaultPropertyIndex;
    }

    /**
     * A bean may have a "default" event that is the event that will mostly
     * commonly be used by human's when using the bean.
     *
     * @return Index of default event in the EventSetDescriptor array returned
     * by getEventSetDescriptors.
     * <P>
     * Returns -1 if there is no default event.
     */
    @Override
    public int getDefaultEventIndex() {
        return defaultEventIndex;
    }

    /**
     * This method returns an image object that can be used to represent the
     * bean in toolboxes, toolbars, etc. Icon images will typically be GIFs, but
     * may in future include other formats.
     * <p>
     * Beans aren't required to provide icons and may return null from this
     * method.
     * <p>
     * There are four possible flavors of icons (16x16 color, 32x32 color, 16x16
     * mono, 32x32 mono). If a bean choses to only support a single icon we
     * recommend supporting 16x16 color.
     * <p>
     * We recommend that icons have a "transparent" background so they can be
     * rendered onto an existing background.
     *
     * @param iconKind The kind of icon requested. This should be one of the
     * constant values ICON_COLOR_16x16, ICON_COLOR_32x32, ICON_MONO_16x16, or
     * ICON_MONO_32x32.
     * @return An image object representing the requested icon. May return null
     * if no suitable icon is available.
     */
    @Override
    public java.awt.Image getIcon(int iconKind) {
        switch (iconKind) {
            case ICON_COLOR_16x16:
                if (iconNameC16 == null) {
                    return null;
                } else {
                    if (iconColor16 == null) {
                        iconColor16 = loadImage(iconNameC16);
                    }
                    return iconColor16;
                }
            case ICON_COLOR_32x32:
                if (iconNameC32 == null) {
                    return null;
                } else {
                    if (iconColor32 == null) {
                        iconColor32 = loadImage(iconNameC32);
                    }
                    return iconColor32;
                }
            case ICON_MONO_16x16:
                if (iconNameM16 == null) {
                    return null;
                } else {
                    if (iconMono16 == null) {
                        iconMono16 = loadImage(iconNameM16);
                    }
                    return iconMono16;
                }
            case ICON_MONO_32x32:
                if (iconNameM32 == null) {
                    return null;
                } else {
                    if (iconMono32 == null) {
                        iconMono32 = loadImage(iconNameM32);
                    }
                    return iconMono32;
                }
            default:
                return null;
        }
    }
    
}
