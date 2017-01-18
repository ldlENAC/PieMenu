/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.masterihm.component.piemenu.menu;

import java.beans.*;

/**
 *
 * @author Geekette
 */
public class JPieMenuBeanInfo extends SimpleBeanInfo {

    // Bean descriptor//GEN-FIRST:BeanDescriptor
    /*lazy BeanDescriptor*/
    private static BeanDescriptor getBdescriptor(){
        BeanDescriptor beanDescriptor = new BeanDescriptor  ( fr.masterihm.component.piemenu.menu.JPieMenu.class , null ); // NOI18N//GEN-HEADEREND:BeanDescriptor
        // Here you can add code for customizing the BeanDescriptor.

        return beanDescriptor;     }//GEN-LAST:BeanDescriptor


    // Property identifiers//GEN-FIRST:Properties
    private static final int PROPERTY_accessibleContext = 0;
    private static final int PROPERTY_actionMap = 1;
    private static final int PROPERTY_alignmentX = 2;
    private static final int PROPERTY_alignmentY = 3;
    private static final int PROPERTY_ancestorListeners = 4;
    private static final int PROPERTY_autoClose = 5;
    private static final int PROPERTY_autoscrolls = 6;
    private static final int PROPERTY_background = 7;
    private static final int PROPERTY_backgroundSet = 8;
    private static final int PROPERTY_baselineResizeBehavior = 9;
    private static final int PROPERTY_border = 10;
    private static final int PROPERTY_bounds = 11;
    private static final int PROPERTY_colorModel = 12;
    private static final int PROPERTY_component = 13;
    private static final int PROPERTY_componentCount = 14;
    private static final int PROPERTY_componentCountInLayer = 15;
    private static final int PROPERTY_componentListeners = 16;
    private static final int PROPERTY_componentOrientation = 17;
    private static final int PROPERTY_componentPopupMenu = 18;
    private static final int PROPERTY_components = 19;
    private static final int PROPERTY_componentsInLayer = 20;
    private static final int PROPERTY_containerListeners = 21;
    private static final int PROPERTY_cursor = 22;
    private static final int PROPERTY_cursorSet = 23;
    private static final int PROPERTY_debugGraphicsOptions = 24;
    private static final int PROPERTY_displayable = 25;
    private static final int PROPERTY_doubleBuffered = 26;
    private static final int PROPERTY_dropTarget = 27;
    private static final int PROPERTY_enabled = 28;
    private static final int PROPERTY_focusable = 29;
    private static final int PROPERTY_focusCycleRoot = 30;
    private static final int PROPERTY_focusCycleRootAncestor = 31;
    private static final int PROPERTY_focusListeners = 32;
    private static final int PROPERTY_focusOwner = 33;
    private static final int PROPERTY_focusTraversable = 34;
    private static final int PROPERTY_focusTraversalKeys = 35;
    private static final int PROPERTY_focusTraversalKeysEnabled = 36;
    private static final int PROPERTY_focusTraversalPolicy = 37;
    private static final int PROPERTY_focusTraversalPolicyProvider = 38;
    private static final int PROPERTY_focusTraversalPolicySet = 39;
    private static final int PROPERTY_font = 40;
    private static final int PROPERTY_fontSet = 41;
    private static final int PROPERTY_foreground = 42;
    private static final int PROPERTY_foregroundSet = 43;
    private static final int PROPERTY_graphics = 44;
    private static final int PROPERTY_graphicsConfiguration = 45;
    private static final int PROPERTY_height = 46;
    private static final int PROPERTY_hierarchyBoundsListeners = 47;
    private static final int PROPERTY_hierarchyListeners = 48;
    private static final int PROPERTY_ignoreRepaint = 49;
    private static final int PROPERTY_inheritsPopupMenu = 50;
    private static final int PROPERTY_inputContext = 51;
    private static final int PROPERTY_inputMap = 52;
    private static final int PROPERTY_inputMethodListeners = 53;
    private static final int PROPERTY_inputMethodRequests = 54;
    private static final int PROPERTY_inputVerifier = 55;
    private static final int PROPERTY_insets = 56;
    private static final int PROPERTY_keyListeners = 57;
    private static final int PROPERTY_layout = 58;
    private static final int PROPERTY_lightweight = 59;
    private static final int PROPERTY_locale = 60;
    private static final int PROPERTY_location = 61;
    private static final int PROPERTY_locationOnScreen = 62;
    private static final int PROPERTY_managingFocus = 63;
    private static final int PROPERTY_maximumSize = 64;
    private static final int PROPERTY_maximumSizeSet = 65;
    private static final int PROPERTY_minimumSize = 66;
    private static final int PROPERTY_minimumSizeSet = 67;
    private static final int PROPERTY_mouseListeners = 68;
    private static final int PROPERTY_mouseMotionListeners = 69;
    private static final int PROPERTY_mousePosition = 70;
    private static final int PROPERTY_mouseWheelListeners = 71;
    private static final int PROPERTY_name = 72;
    private static final int PROPERTY_nextFocusableComponent = 73;
    private static final int PROPERTY_opaque = 74;
    private static final int PROPERTY_optimizedDrawingEnabled = 75;
    private static final int PROPERTY_paintingForPrint = 76;
    private static final int PROPERTY_paintingTile = 77;
    private static final int PROPERTY_parent = 78;
    private static final int PROPERTY_peer = 79;
    private static final int PROPERTY_preferredSize = 80;
    private static final int PROPERTY_preferredSizeSet = 81;
    private static final int PROPERTY_propertyChangeListeners = 82;
    private static final int PROPERTY_radius = 83;
    private static final int PROPERTY_registeredKeyStrokes = 84;
    private static final int PROPERTY_requestFocusEnabled = 85;
    private static final int PROPERTY_rootPane = 86;
    private static final int PROPERTY_showing = 87;
    private static final int PROPERTY_size = 88;
    private static final int PROPERTY_toolkit = 89;
    private static final int PROPERTY_toolTipText = 90;
    private static final int PROPERTY_topLevelAncestor = 91;
    private static final int PROPERTY_transferHandler = 92;
    private static final int PROPERTY_treeLock = 93;
    private static final int PROPERTY_UIClassID = 94;
    private static final int PROPERTY_valid = 95;
    private static final int PROPERTY_validateRoot = 96;
    private static final int PROPERTY_verifyInputWhenFocusTarget = 97;
    private static final int PROPERTY_vetoableChangeListeners = 98;
    private static final int PROPERTY_visible = 99;
    private static final int PROPERTY_visibleRect = 100;
    private static final int PROPERTY_width = 101;
    private static final int PROPERTY_x = 102;
    private static final int PROPERTY_y = 103;

    // Property array 
    /*lazy PropertyDescriptor*/
    private static PropertyDescriptor[] getPdescriptor(){
        PropertyDescriptor[] properties = new PropertyDescriptor[104];
    
        try {
            properties[PROPERTY_accessibleContext] = new PropertyDescriptor ( "accessibleContext", fr.masterihm.component.piemenu.menu.JPieMenu.class, "getAccessibleContext", null ); // NOI18N
            properties[PROPERTY_actionMap] = new PropertyDescriptor ( "actionMap", fr.masterihm.component.piemenu.menu.JPieMenu.class, "getActionMap", "setActionMap" ); // NOI18N
            properties[PROPERTY_alignmentX] = new PropertyDescriptor ( "alignmentX", fr.masterihm.component.piemenu.menu.JPieMenu.class, "getAlignmentX", "setAlignmentX" ); // NOI18N
            properties[PROPERTY_alignmentY] = new PropertyDescriptor ( "alignmentY", fr.masterihm.component.piemenu.menu.JPieMenu.class, "getAlignmentY", "setAlignmentY" ); // NOI18N
            properties[PROPERTY_ancestorListeners] = new PropertyDescriptor ( "ancestorListeners", fr.masterihm.component.piemenu.menu.JPieMenu.class, "getAncestorListeners", null ); // NOI18N
            properties[PROPERTY_autoClose] = new PropertyDescriptor ( "autoClose", fr.masterihm.component.piemenu.menu.JPieMenu.class, "isAutoClose", "setAutoClose" ); // NOI18N
            properties[PROPERTY_autoscrolls] = new PropertyDescriptor ( "autoscrolls", fr.masterihm.component.piemenu.menu.JPieMenu.class, "getAutoscrolls", "setAutoscrolls" ); // NOI18N
            properties[PROPERTY_background] = new PropertyDescriptor ( "background", fr.masterihm.component.piemenu.menu.JPieMenu.class, "getBackground", "setBackground" ); // NOI18N
            properties[PROPERTY_backgroundSet] = new PropertyDescriptor ( "backgroundSet", fr.masterihm.component.piemenu.menu.JPieMenu.class, "isBackgroundSet", null ); // NOI18N
            properties[PROPERTY_baselineResizeBehavior] = new PropertyDescriptor ( "baselineResizeBehavior", fr.masterihm.component.piemenu.menu.JPieMenu.class, "getBaselineResizeBehavior", null ); // NOI18N
            properties[PROPERTY_border] = new PropertyDescriptor ( "border", fr.masterihm.component.piemenu.menu.JPieMenu.class, "getBorder", "setBorder" ); // NOI18N
            properties[PROPERTY_bounds] = new PropertyDescriptor ( "bounds", fr.masterihm.component.piemenu.menu.JPieMenu.class, "getBounds", "setBounds" ); // NOI18N
            properties[PROPERTY_colorModel] = new PropertyDescriptor ( "colorModel", fr.masterihm.component.piemenu.menu.JPieMenu.class, "getColorModel", null ); // NOI18N
            properties[PROPERTY_component] = new IndexedPropertyDescriptor ( "component", fr.masterihm.component.piemenu.menu.JPieMenu.class, null, null, "getComponent", null ); // NOI18N
            properties[PROPERTY_componentCount] = new PropertyDescriptor ( "componentCount", fr.masterihm.component.piemenu.menu.JPieMenu.class, "getComponentCount", null ); // NOI18N
            properties[PROPERTY_componentCountInLayer] = new IndexedPropertyDescriptor ( "componentCountInLayer", fr.masterihm.component.piemenu.menu.JPieMenu.class, null, null, "getComponentCountInLayer", null ); // NOI18N
            properties[PROPERTY_componentListeners] = new PropertyDescriptor ( "componentListeners", fr.masterihm.component.piemenu.menu.JPieMenu.class, "getComponentListeners", null ); // NOI18N
            properties[PROPERTY_componentOrientation] = new PropertyDescriptor ( "componentOrientation", fr.masterihm.component.piemenu.menu.JPieMenu.class, "getComponentOrientation", "setComponentOrientation" ); // NOI18N
            properties[PROPERTY_componentPopupMenu] = new PropertyDescriptor ( "componentPopupMenu", fr.masterihm.component.piemenu.menu.JPieMenu.class, "getComponentPopupMenu", "setComponentPopupMenu" ); // NOI18N
            properties[PROPERTY_components] = new PropertyDescriptor ( "components", fr.masterihm.component.piemenu.menu.JPieMenu.class, "getComponents", null ); // NOI18N
            properties[PROPERTY_componentsInLayer] = new IndexedPropertyDescriptor ( "componentsInLayer", fr.masterihm.component.piemenu.menu.JPieMenu.class, null, null, "getComponentsInLayer", null ); // NOI18N
            properties[PROPERTY_containerListeners] = new PropertyDescriptor ( "containerListeners", fr.masterihm.component.piemenu.menu.JPieMenu.class, "getContainerListeners", null ); // NOI18N
            properties[PROPERTY_cursor] = new PropertyDescriptor ( "cursor", fr.masterihm.component.piemenu.menu.JPieMenu.class, "getCursor", "setCursor" ); // NOI18N
            properties[PROPERTY_cursorSet] = new PropertyDescriptor ( "cursorSet", fr.masterihm.component.piemenu.menu.JPieMenu.class, "isCursorSet", null ); // NOI18N
            properties[PROPERTY_debugGraphicsOptions] = new PropertyDescriptor ( "debugGraphicsOptions", fr.masterihm.component.piemenu.menu.JPieMenu.class, "getDebugGraphicsOptions", "setDebugGraphicsOptions" ); // NOI18N
            properties[PROPERTY_displayable] = new PropertyDescriptor ( "displayable", fr.masterihm.component.piemenu.menu.JPieMenu.class, "isDisplayable", null ); // NOI18N
            properties[PROPERTY_doubleBuffered] = new PropertyDescriptor ( "doubleBuffered", fr.masterihm.component.piemenu.menu.JPieMenu.class, "isDoubleBuffered", "setDoubleBuffered" ); // NOI18N
            properties[PROPERTY_dropTarget] = new PropertyDescriptor ( "dropTarget", fr.masterihm.component.piemenu.menu.JPieMenu.class, "getDropTarget", "setDropTarget" ); // NOI18N
            properties[PROPERTY_enabled] = new PropertyDescriptor ( "enabled", fr.masterihm.component.piemenu.menu.JPieMenu.class, "isEnabled", "setEnabled" ); // NOI18N
            properties[PROPERTY_focusable] = new PropertyDescriptor ( "focusable", fr.masterihm.component.piemenu.menu.JPieMenu.class, "isFocusable", "setFocusable" ); // NOI18N
            properties[PROPERTY_focusCycleRoot] = new PropertyDescriptor ( "focusCycleRoot", fr.masterihm.component.piemenu.menu.JPieMenu.class, "isFocusCycleRoot", "setFocusCycleRoot" ); // NOI18N
            properties[PROPERTY_focusCycleRootAncestor] = new PropertyDescriptor ( "focusCycleRootAncestor", fr.masterihm.component.piemenu.menu.JPieMenu.class, "getFocusCycleRootAncestor", null ); // NOI18N
            properties[PROPERTY_focusListeners] = new PropertyDescriptor ( "focusListeners", fr.masterihm.component.piemenu.menu.JPieMenu.class, "getFocusListeners", null ); // NOI18N
            properties[PROPERTY_focusOwner] = new PropertyDescriptor ( "focusOwner", fr.masterihm.component.piemenu.menu.JPieMenu.class, "isFocusOwner", null ); // NOI18N
            properties[PROPERTY_focusTraversable] = new PropertyDescriptor ( "focusTraversable", fr.masterihm.component.piemenu.menu.JPieMenu.class, "isFocusTraversable", null ); // NOI18N
            properties[PROPERTY_focusTraversalKeys] = new IndexedPropertyDescriptor ( "focusTraversalKeys", fr.masterihm.component.piemenu.menu.JPieMenu.class, null, null, null, "setFocusTraversalKeys" ); // NOI18N
            properties[PROPERTY_focusTraversalKeysEnabled] = new PropertyDescriptor ( "focusTraversalKeysEnabled", fr.masterihm.component.piemenu.menu.JPieMenu.class, "getFocusTraversalKeysEnabled", "setFocusTraversalKeysEnabled" ); // NOI18N
            properties[PROPERTY_focusTraversalPolicy] = new PropertyDescriptor ( "focusTraversalPolicy", fr.masterihm.component.piemenu.menu.JPieMenu.class, "getFocusTraversalPolicy", "setFocusTraversalPolicy" ); // NOI18N
            properties[PROPERTY_focusTraversalPolicyProvider] = new PropertyDescriptor ( "focusTraversalPolicyProvider", fr.masterihm.component.piemenu.menu.JPieMenu.class, "isFocusTraversalPolicyProvider", "setFocusTraversalPolicyProvider" ); // NOI18N
            properties[PROPERTY_focusTraversalPolicySet] = new PropertyDescriptor ( "focusTraversalPolicySet", fr.masterihm.component.piemenu.menu.JPieMenu.class, "isFocusTraversalPolicySet", null ); // NOI18N
            properties[PROPERTY_font] = new PropertyDescriptor ( "font", fr.masterihm.component.piemenu.menu.JPieMenu.class, "getFont", "setFont" ); // NOI18N
            properties[PROPERTY_fontSet] = new PropertyDescriptor ( "fontSet", fr.masterihm.component.piemenu.menu.JPieMenu.class, "isFontSet", null ); // NOI18N
            properties[PROPERTY_foreground] = new PropertyDescriptor ( "foreground", fr.masterihm.component.piemenu.menu.JPieMenu.class, "getForeground", "setForeground" ); // NOI18N
            properties[PROPERTY_foregroundSet] = new PropertyDescriptor ( "foregroundSet", fr.masterihm.component.piemenu.menu.JPieMenu.class, "isForegroundSet", null ); // NOI18N
            properties[PROPERTY_graphics] = new PropertyDescriptor ( "graphics", fr.masterihm.component.piemenu.menu.JPieMenu.class, "getGraphics", null ); // NOI18N
            properties[PROPERTY_graphicsConfiguration] = new PropertyDescriptor ( "graphicsConfiguration", fr.masterihm.component.piemenu.menu.JPieMenu.class, "getGraphicsConfiguration", null ); // NOI18N
            properties[PROPERTY_height] = new PropertyDescriptor ( "height", fr.masterihm.component.piemenu.menu.JPieMenu.class, "getHeight", null ); // NOI18N
            properties[PROPERTY_hierarchyBoundsListeners] = new PropertyDescriptor ( "hierarchyBoundsListeners", fr.masterihm.component.piemenu.menu.JPieMenu.class, "getHierarchyBoundsListeners", null ); // NOI18N
            properties[PROPERTY_hierarchyListeners] = new PropertyDescriptor ( "hierarchyListeners", fr.masterihm.component.piemenu.menu.JPieMenu.class, "getHierarchyListeners", null ); // NOI18N
            properties[PROPERTY_ignoreRepaint] = new PropertyDescriptor ( "ignoreRepaint", fr.masterihm.component.piemenu.menu.JPieMenu.class, "getIgnoreRepaint", "setIgnoreRepaint" ); // NOI18N
            properties[PROPERTY_inheritsPopupMenu] = new PropertyDescriptor ( "inheritsPopupMenu", fr.masterihm.component.piemenu.menu.JPieMenu.class, "getInheritsPopupMenu", "setInheritsPopupMenu" ); // NOI18N
            properties[PROPERTY_inputContext] = new PropertyDescriptor ( "inputContext", fr.masterihm.component.piemenu.menu.JPieMenu.class, "getInputContext", null ); // NOI18N
            properties[PROPERTY_inputMap] = new PropertyDescriptor ( "inputMap", fr.masterihm.component.piemenu.menu.JPieMenu.class, "getInputMap", null ); // NOI18N
            properties[PROPERTY_inputMethodListeners] = new PropertyDescriptor ( "inputMethodListeners", fr.masterihm.component.piemenu.menu.JPieMenu.class, "getInputMethodListeners", null ); // NOI18N
            properties[PROPERTY_inputMethodRequests] = new PropertyDescriptor ( "inputMethodRequests", fr.masterihm.component.piemenu.menu.JPieMenu.class, "getInputMethodRequests", null ); // NOI18N
            properties[PROPERTY_inputVerifier] = new PropertyDescriptor ( "inputVerifier", fr.masterihm.component.piemenu.menu.JPieMenu.class, "getInputVerifier", "setInputVerifier" ); // NOI18N
            properties[PROPERTY_insets] = new PropertyDescriptor ( "insets", fr.masterihm.component.piemenu.menu.JPieMenu.class, "getInsets", null ); // NOI18N
            properties[PROPERTY_keyListeners] = new PropertyDescriptor ( "keyListeners", fr.masterihm.component.piemenu.menu.JPieMenu.class, "getKeyListeners", null ); // NOI18N
            properties[PROPERTY_layout] = new PropertyDescriptor ( "layout", fr.masterihm.component.piemenu.menu.JPieMenu.class, "getLayout", "setLayout" ); // NOI18N
            properties[PROPERTY_lightweight] = new PropertyDescriptor ( "lightweight", fr.masterihm.component.piemenu.menu.JPieMenu.class, "isLightweight", null ); // NOI18N
            properties[PROPERTY_locale] = new PropertyDescriptor ( "locale", fr.masterihm.component.piemenu.menu.JPieMenu.class, "getLocale", "setLocale" ); // NOI18N
            properties[PROPERTY_location] = new PropertyDescriptor ( "location", fr.masterihm.component.piemenu.menu.JPieMenu.class, "getLocation", "setLocation" ); // NOI18N
            properties[PROPERTY_locationOnScreen] = new PropertyDescriptor ( "locationOnScreen", fr.masterihm.component.piemenu.menu.JPieMenu.class, "getLocationOnScreen", null ); // NOI18N
            properties[PROPERTY_managingFocus] = new PropertyDescriptor ( "managingFocus", fr.masterihm.component.piemenu.menu.JPieMenu.class, "isManagingFocus", null ); // NOI18N
            properties[PROPERTY_maximumSize] = new PropertyDescriptor ( "maximumSize", fr.masterihm.component.piemenu.menu.JPieMenu.class, "getMaximumSize", "setMaximumSize" ); // NOI18N
            properties[PROPERTY_maximumSizeSet] = new PropertyDescriptor ( "maximumSizeSet", fr.masterihm.component.piemenu.menu.JPieMenu.class, "isMaximumSizeSet", null ); // NOI18N
            properties[PROPERTY_minimumSize] = new PropertyDescriptor ( "minimumSize", fr.masterihm.component.piemenu.menu.JPieMenu.class, "getMinimumSize", "setMinimumSize" ); // NOI18N
            properties[PROPERTY_minimumSizeSet] = new PropertyDescriptor ( "minimumSizeSet", fr.masterihm.component.piemenu.menu.JPieMenu.class, "isMinimumSizeSet", null ); // NOI18N
            properties[PROPERTY_mouseListeners] = new PropertyDescriptor ( "mouseListeners", fr.masterihm.component.piemenu.menu.JPieMenu.class, "getMouseListeners", null ); // NOI18N
            properties[PROPERTY_mouseMotionListeners] = new PropertyDescriptor ( "mouseMotionListeners", fr.masterihm.component.piemenu.menu.JPieMenu.class, "getMouseMotionListeners", null ); // NOI18N
            properties[PROPERTY_mousePosition] = new PropertyDescriptor ( "mousePosition", fr.masterihm.component.piemenu.menu.JPieMenu.class, "getMousePosition", null ); // NOI18N
            properties[PROPERTY_mouseWheelListeners] = new PropertyDescriptor ( "mouseWheelListeners", fr.masterihm.component.piemenu.menu.JPieMenu.class, "getMouseWheelListeners", null ); // NOI18N
            properties[PROPERTY_name] = new PropertyDescriptor ( "name", fr.masterihm.component.piemenu.menu.JPieMenu.class, "getName", "setName" ); // NOI18N
            properties[PROPERTY_nextFocusableComponent] = new PropertyDescriptor ( "nextFocusableComponent", fr.masterihm.component.piemenu.menu.JPieMenu.class, "getNextFocusableComponent", "setNextFocusableComponent" ); // NOI18N
            properties[PROPERTY_opaque] = new PropertyDescriptor ( "opaque", fr.masterihm.component.piemenu.menu.JPieMenu.class, "isOpaque", "setOpaque" ); // NOI18N
            properties[PROPERTY_optimizedDrawingEnabled] = new PropertyDescriptor ( "optimizedDrawingEnabled", fr.masterihm.component.piemenu.menu.JPieMenu.class, "isOptimizedDrawingEnabled", null ); // NOI18N
            properties[PROPERTY_paintingForPrint] = new PropertyDescriptor ( "paintingForPrint", fr.masterihm.component.piemenu.menu.JPieMenu.class, "isPaintingForPrint", null ); // NOI18N
            properties[PROPERTY_paintingTile] = new PropertyDescriptor ( "paintingTile", fr.masterihm.component.piemenu.menu.JPieMenu.class, "isPaintingTile", null ); // NOI18N
            properties[PROPERTY_parent] = new PropertyDescriptor ( "parent", fr.masterihm.component.piemenu.menu.JPieMenu.class, "getParent", null ); // NOI18N
            properties[PROPERTY_peer] = new PropertyDescriptor ( "peer", fr.masterihm.component.piemenu.menu.JPieMenu.class, "getPeer", null ); // NOI18N
            properties[PROPERTY_preferredSize] = new PropertyDescriptor ( "preferredSize", fr.masterihm.component.piemenu.menu.JPieMenu.class, "getPreferredSize", "setPreferredSize" ); // NOI18N
            properties[PROPERTY_preferredSizeSet] = new PropertyDescriptor ( "preferredSizeSet", fr.masterihm.component.piemenu.menu.JPieMenu.class, "isPreferredSizeSet", null ); // NOI18N
            properties[PROPERTY_propertyChangeListeners] = new PropertyDescriptor ( "propertyChangeListeners", fr.masterihm.component.piemenu.menu.JPieMenu.class, "getPropertyChangeListeners", null ); // NOI18N
            properties[PROPERTY_radius] = new PropertyDescriptor ( "radius", fr.masterihm.component.piemenu.menu.JPieMenu.class, "getRadius", "setRadius" ); // NOI18N
            properties[PROPERTY_registeredKeyStrokes] = new PropertyDescriptor ( "registeredKeyStrokes", fr.masterihm.component.piemenu.menu.JPieMenu.class, "getRegisteredKeyStrokes", null ); // NOI18N
            properties[PROPERTY_requestFocusEnabled] = new PropertyDescriptor ( "requestFocusEnabled", fr.masterihm.component.piemenu.menu.JPieMenu.class, "isRequestFocusEnabled", "setRequestFocusEnabled" ); // NOI18N
            properties[PROPERTY_rootPane] = new PropertyDescriptor ( "rootPane", fr.masterihm.component.piemenu.menu.JPieMenu.class, "getRootPane", null ); // NOI18N
            properties[PROPERTY_showing] = new PropertyDescriptor ( "showing", fr.masterihm.component.piemenu.menu.JPieMenu.class, "isShowing", null ); // NOI18N
            properties[PROPERTY_size] = new PropertyDescriptor ( "size", fr.masterihm.component.piemenu.menu.JPieMenu.class, "getSize", "setSize" ); // NOI18N
            properties[PROPERTY_toolkit] = new PropertyDescriptor ( "toolkit", fr.masterihm.component.piemenu.menu.JPieMenu.class, "getToolkit", null ); // NOI18N
            properties[PROPERTY_toolTipText] = new PropertyDescriptor ( "toolTipText", fr.masterihm.component.piemenu.menu.JPieMenu.class, "getToolTipText", "setToolTipText" ); // NOI18N
            properties[PROPERTY_topLevelAncestor] = new PropertyDescriptor ( "topLevelAncestor", fr.masterihm.component.piemenu.menu.JPieMenu.class, "getTopLevelAncestor", null ); // NOI18N
            properties[PROPERTY_transferHandler] = new PropertyDescriptor ( "transferHandler", fr.masterihm.component.piemenu.menu.JPieMenu.class, "getTransferHandler", "setTransferHandler" ); // NOI18N
            properties[PROPERTY_treeLock] = new PropertyDescriptor ( "treeLock", fr.masterihm.component.piemenu.menu.JPieMenu.class, "getTreeLock", null ); // NOI18N
            properties[PROPERTY_UIClassID] = new PropertyDescriptor ( "UIClassID", fr.masterihm.component.piemenu.menu.JPieMenu.class, "getUIClassID", null ); // NOI18N
            properties[PROPERTY_valid] = new PropertyDescriptor ( "valid", fr.masterihm.component.piemenu.menu.JPieMenu.class, "isValid", null ); // NOI18N
            properties[PROPERTY_validateRoot] = new PropertyDescriptor ( "validateRoot", fr.masterihm.component.piemenu.menu.JPieMenu.class, "isValidateRoot", null ); // NOI18N
            properties[PROPERTY_verifyInputWhenFocusTarget] = new PropertyDescriptor ( "verifyInputWhenFocusTarget", fr.masterihm.component.piemenu.menu.JPieMenu.class, "getVerifyInputWhenFocusTarget", "setVerifyInputWhenFocusTarget" ); // NOI18N
            properties[PROPERTY_vetoableChangeListeners] = new PropertyDescriptor ( "vetoableChangeListeners", fr.masterihm.component.piemenu.menu.JPieMenu.class, "getVetoableChangeListeners", null ); // NOI18N
            properties[PROPERTY_visible] = new PropertyDescriptor ( "visible", fr.masterihm.component.piemenu.menu.JPieMenu.class, "isVisible", "setVisible" ); // NOI18N
            properties[PROPERTY_visibleRect] = new PropertyDescriptor ( "visibleRect", fr.masterihm.component.piemenu.menu.JPieMenu.class, "getVisibleRect", null ); // NOI18N
            properties[PROPERTY_width] = new PropertyDescriptor ( "width", fr.masterihm.component.piemenu.menu.JPieMenu.class, "getWidth", null ); // NOI18N
            properties[PROPERTY_x] = new PropertyDescriptor ( "x", fr.masterihm.component.piemenu.menu.JPieMenu.class, "getX", null ); // NOI18N
            properties[PROPERTY_y] = new PropertyDescriptor ( "y", fr.masterihm.component.piemenu.menu.JPieMenu.class, "getY", null ); // NOI18N
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
    private static final int EVENT_keyListener = 7;
    private static final int EVENT_mouseListener = 8;
    private static final int EVENT_mouseMotionListener = 9;
    private static final int EVENT_mouseWheelListener = 10;
    private static final int EVENT_propertyChangeListener = 11;
    private static final int EVENT_vetoableChangeListener = 12;

    // EventSet array
    /*lazy EventSetDescriptor*/
    private static EventSetDescriptor[] getEdescriptor(){
        EventSetDescriptor[] eventSets = new EventSetDescriptor[13];
    
        try {
            eventSets[EVENT_ancestorListener] = new EventSetDescriptor ( fr.masterihm.component.piemenu.menu.JPieMenu.class, "ancestorListener", javax.swing.event.AncestorListener.class, new String[] {"ancestorAdded", "ancestorRemoved", "ancestorMoved"}, "addAncestorListener", "removeAncestorListener" ); // NOI18N
            eventSets[EVENT_componentListener] = new EventSetDescriptor ( fr.masterihm.component.piemenu.menu.JPieMenu.class, "componentListener", java.awt.event.ComponentListener.class, new String[] {"componentResized", "componentMoved", "componentShown", "componentHidden"}, "addComponentListener", "removeComponentListener" ); // NOI18N
            eventSets[EVENT_containerListener] = new EventSetDescriptor ( fr.masterihm.component.piemenu.menu.JPieMenu.class, "containerListener", java.awt.event.ContainerListener.class, new String[] {"componentAdded", "componentRemoved"}, "addContainerListener", "removeContainerListener" ); // NOI18N
            eventSets[EVENT_focusListener] = new EventSetDescriptor ( fr.masterihm.component.piemenu.menu.JPieMenu.class, "focusListener", java.awt.event.FocusListener.class, new String[] {"focusGained", "focusLost"}, "addFocusListener", "removeFocusListener" ); // NOI18N
            eventSets[EVENT_hierarchyBoundsListener] = new EventSetDescriptor ( fr.masterihm.component.piemenu.menu.JPieMenu.class, "hierarchyBoundsListener", java.awt.event.HierarchyBoundsListener.class, new String[] {"ancestorMoved", "ancestorResized"}, "addHierarchyBoundsListener", "removeHierarchyBoundsListener" ); // NOI18N
            eventSets[EVENT_hierarchyListener] = new EventSetDescriptor ( fr.masterihm.component.piemenu.menu.JPieMenu.class, "hierarchyListener", java.awt.event.HierarchyListener.class, new String[] {"hierarchyChanged"}, "addHierarchyListener", "removeHierarchyListener" ); // NOI18N
            eventSets[EVENT_inputMethodListener] = new EventSetDescriptor ( fr.masterihm.component.piemenu.menu.JPieMenu.class, "inputMethodListener", java.awt.event.InputMethodListener.class, new String[] {"inputMethodTextChanged", "caretPositionChanged"}, "addInputMethodListener", "removeInputMethodListener" ); // NOI18N
            eventSets[EVENT_keyListener] = new EventSetDescriptor ( fr.masterihm.component.piemenu.menu.JPieMenu.class, "keyListener", java.awt.event.KeyListener.class, new String[] {"keyTyped", "keyPressed", "keyReleased"}, "addKeyListener", "removeKeyListener" ); // NOI18N
            eventSets[EVENT_mouseListener] = new EventSetDescriptor ( fr.masterihm.component.piemenu.menu.JPieMenu.class, "mouseListener", java.awt.event.MouseListener.class, new String[] {"mouseClicked", "mousePressed", "mouseReleased", "mouseEntered", "mouseExited"}, "addMouseListener", "removeMouseListener" ); // NOI18N
            eventSets[EVENT_mouseMotionListener] = new EventSetDescriptor ( fr.masterihm.component.piemenu.menu.JPieMenu.class, "mouseMotionListener", java.awt.event.MouseMotionListener.class, new String[] {"mouseDragged", "mouseMoved"}, "addMouseMotionListener", "removeMouseMotionListener" ); // NOI18N
            eventSets[EVENT_mouseWheelListener] = new EventSetDescriptor ( fr.masterihm.component.piemenu.menu.JPieMenu.class, "mouseWheelListener", java.awt.event.MouseWheelListener.class, new String[] {"mouseWheelMoved"}, "addMouseWheelListener", "removeMouseWheelListener" ); // NOI18N
            eventSets[EVENT_propertyChangeListener] = new EventSetDescriptor ( fr.masterihm.component.piemenu.menu.JPieMenu.class, "propertyChangeListener", java.beans.PropertyChangeListener.class, new String[] {"propertyChange"}, "addPropertyChangeListener", "removePropertyChangeListener" ); // NOI18N
            eventSets[EVENT_vetoableChangeListener] = new EventSetDescriptor ( fr.masterihm.component.piemenu.menu.JPieMenu.class, "vetoableChangeListener", java.beans.VetoableChangeListener.class, new String[] {"vetoableChange"}, "addVetoableChangeListener", "removeVetoableChangeListener" ); // NOI18N
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
    private static final int METHOD_addPieMenuItem8 = 8;
    private static final int METHOD_addPropertyChangeListener9 = 9;
    private static final int METHOD_applyComponentOrientation10 = 10;
    private static final int METHOD_areFocusTraversalKeysSet11 = 11;
    private static final int METHOD_bounds12 = 12;
    private static final int METHOD_checkImage13 = 13;
    private static final int METHOD_checkImage14 = 14;
    private static final int METHOD_computeVisibleRect15 = 15;
    private static final int METHOD_contains16 = 16;
    private static final int METHOD_contains17 = 17;
    private static final int METHOD_countComponents18 = 18;
    private static final int METHOD_createImage19 = 19;
    private static final int METHOD_createImage20 = 20;
    private static final int METHOD_createToolTip21 = 21;
    private static final int METHOD_createVolatileImage22 = 22;
    private static final int METHOD_createVolatileImage23 = 23;
    private static final int METHOD_deliverEvent24 = 24;
    private static final int METHOD_disable25 = 25;
    private static final int METHOD_dispatchEvent26 = 26;
    private static final int METHOD_doLayout27 = 27;
    private static final int METHOD_enable28 = 28;
    private static final int METHOD_enable29 = 29;
    private static final int METHOD_enableInputMethods30 = 30;
    private static final int METHOD_findComponentAt31 = 31;
    private static final int METHOD_findComponentAt32 = 32;
    private static final int METHOD_firePropertyChange33 = 33;
    private static final int METHOD_firePropertyChange34 = 34;
    private static final int METHOD_firePropertyChange35 = 35;
    private static final int METHOD_firePropertyChange36 = 36;
    private static final int METHOD_firePropertyChange37 = 37;
    private static final int METHOD_firePropertyChange38 = 38;
    private static final int METHOD_firePropertyChange39 = 39;
    private static final int METHOD_firePropertyChange40 = 40;
    private static final int METHOD_getActionForKeyStroke41 = 41;
    private static final int METHOD_getBaseline42 = 42;
    private static final int METHOD_getBounds43 = 43;
    private static final int METHOD_getClientProperty44 = 44;
    private static final int METHOD_getComponentAt45 = 45;
    private static final int METHOD_getComponentAt46 = 46;
    private static final int METHOD_getComponentZOrder47 = 47;
    private static final int METHOD_getConditionForKeyStroke48 = 48;
    private static final int METHOD_getDefaultLocale49 = 49;
    private static final int METHOD_getFocusTraversalKeys50 = 50;
    private static final int METHOD_getFontMetrics51 = 51;
    private static final int METHOD_getIndexOf52 = 52;
    private static final int METHOD_getInsets53 = 53;
    private static final int METHOD_getLayer54 = 54;
    private static final int METHOD_getLayer55 = 55;
    private static final int METHOD_getLayeredPaneAbove56 = 56;
    private static final int METHOD_getListeners57 = 57;
    private static final int METHOD_getLocation58 = 58;
    private static final int METHOD_getMousePosition59 = 59;
    private static final int METHOD_getPopupLocation60 = 60;
    private static final int METHOD_getPosition61 = 61;
    private static final int METHOD_getPropertyChangeListeners62 = 62;
    private static final int METHOD_getSize63 = 63;
    private static final int METHOD_getToolTipLocation64 = 64;
    private static final int METHOD_getToolTipText65 = 65;
    private static final int METHOD_gotFocus66 = 66;
    private static final int METHOD_grabFocus67 = 67;
    private static final int METHOD_handleEvent68 = 68;
    private static final int METHOD_hasFocus69 = 69;
    private static final int METHOD_hide70 = 70;
    private static final int METHOD_highestLayer71 = 71;
    private static final int METHOD_imageUpdate72 = 72;
    private static final int METHOD_insets73 = 73;
    private static final int METHOD_inside74 = 74;
    private static final int METHOD_invalidate75 = 75;
    private static final int METHOD_isAncestorOf76 = 76;
    private static final int METHOD_isFocusCycleRoot77 = 77;
    private static final int METHOD_isLightweightComponent78 = 78;
    private static final int METHOD_keyDown79 = 79;
    private static final int METHOD_keyUp80 = 80;
    private static final int METHOD_layout81 = 81;
    private static final int METHOD_list82 = 82;
    private static final int METHOD_list83 = 83;
    private static final int METHOD_list84 = 84;
    private static final int METHOD_list85 = 85;
    private static final int METHOD_list86 = 86;
    private static final int METHOD_locate87 = 87;
    private static final int METHOD_location88 = 88;
    private static final int METHOD_lostFocus89 = 89;
    private static final int METHOD_lowestLayer90 = 90;
    private static final int METHOD_minimumSize91 = 91;
    private static final int METHOD_mouseDown92 = 92;
    private static final int METHOD_mouseDrag93 = 93;
    private static final int METHOD_mouseEnter94 = 94;
    private static final int METHOD_mouseExit95 = 95;
    private static final int METHOD_mouseMove96 = 96;
    private static final int METHOD_mouseUp97 = 97;
    private static final int METHOD_move98 = 98;
    private static final int METHOD_moveToBack99 = 99;
    private static final int METHOD_moveToFront100 = 100;
    private static final int METHOD_nextFocus101 = 101;
    private static final int METHOD_paint102 = 102;
    private static final int METHOD_paintAll103 = 103;
    private static final int METHOD_paintComponents104 = 104;
    private static final int METHOD_paintImmediately105 = 105;
    private static final int METHOD_paintImmediately106 = 106;
    private static final int METHOD_postEvent107 = 107;
    private static final int METHOD_preferredSize108 = 108;
    private static final int METHOD_prepareImage109 = 109;
    private static final int METHOD_prepareImage110 = 110;
    private static final int METHOD_print111 = 111;
    private static final int METHOD_printAll112 = 112;
    private static final int METHOD_printComponents113 = 113;
    private static final int METHOD_putClientProperty114 = 114;
    private static final int METHOD_putLayer115 = 115;
    private static final int METHOD_registerKeyboardAction116 = 116;
    private static final int METHOD_registerKeyboardAction117 = 117;
    private static final int METHOD_remove118 = 118;
    private static final int METHOD_remove119 = 119;
    private static final int METHOD_remove120 = 120;
    private static final int METHOD_removeAll121 = 121;
    private static final int METHOD_removeNotify122 = 122;
    private static final int METHOD_removePieMenuItem123 = 123;
    private static final int METHOD_removePropertyChangeListener124 = 124;
    private static final int METHOD_repaint125 = 125;
    private static final int METHOD_repaint126 = 126;
    private static final int METHOD_repaint127 = 127;
    private static final int METHOD_repaint128 = 128;
    private static final int METHOD_repaint129 = 129;
    private static final int METHOD_requestDefaultFocus130 = 130;
    private static final int METHOD_requestFocus131 = 131;
    private static final int METHOD_requestFocus132 = 132;
    private static final int METHOD_requestFocusInWindow133 = 133;
    private static final int METHOD_resetKeyboardActions134 = 134;
    private static final int METHOD_reshape135 = 135;
    private static final int METHOD_resize136 = 136;
    private static final int METHOD_resize137 = 137;
    private static final int METHOD_revalidate138 = 138;
    private static final int METHOD_scrollRectToVisible139 = 139;
    private static final int METHOD_setBounds140 = 140;
    private static final int METHOD_setComponentZOrder141 = 141;
    private static final int METHOD_setDefaultLocale142 = 142;
    private static final int METHOD_setLayer143 = 143;
    private static final int METHOD_setLayer144 = 144;
    private static final int METHOD_setPosition145 = 145;
    private static final int METHOD_show146 = 146;
    private static final int METHOD_show147 = 147;
    private static final int METHOD_show148 = 148;
    private static final int METHOD_size149 = 149;
    private static final int METHOD_toString150 = 150;
    private static final int METHOD_transferFocus151 = 151;
    private static final int METHOD_transferFocusBackward152 = 152;
    private static final int METHOD_transferFocusDownCycle153 = 153;
    private static final int METHOD_transferFocusUpCycle154 = 154;
    private static final int METHOD_unregisterKeyboardAction155 = 155;
    private static final int METHOD_update156 = 156;
    private static final int METHOD_updateUI157 = 157;
    private static final int METHOD_validate158 = 158;

    // Method array 
    /*lazy MethodDescriptor*/
    private static MethodDescriptor[] getMdescriptor(){
        MethodDescriptor[] methods = new MethodDescriptor[159];
    
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
            methods[METHOD_addPieMenuItem8] = new MethodDescriptor(fr.masterihm.component.piemenu.menu.JPieMenu.class.getMethod("addPieMenuItem", new Class[] {fr.masterihm.component.piemenu.menu.JPieMenuItem.class})); // NOI18N
            methods[METHOD_addPieMenuItem8].setDisplayName ( "" );
            methods[METHOD_addPropertyChangeListener9] = new MethodDescriptor(java.awt.Container.class.getMethod("addPropertyChangeListener", new Class[] {java.lang.String.class, java.beans.PropertyChangeListener.class})); // NOI18N
            methods[METHOD_addPropertyChangeListener9].setDisplayName ( "" );
            methods[METHOD_applyComponentOrientation10] = new MethodDescriptor(java.awt.Container.class.getMethod("applyComponentOrientation", new Class[] {java.awt.ComponentOrientation.class})); // NOI18N
            methods[METHOD_applyComponentOrientation10].setDisplayName ( "" );
            methods[METHOD_areFocusTraversalKeysSet11] = new MethodDescriptor(java.awt.Container.class.getMethod("areFocusTraversalKeysSet", new Class[] {int.class})); // NOI18N
            methods[METHOD_areFocusTraversalKeysSet11].setDisplayName ( "" );
            methods[METHOD_bounds12] = new MethodDescriptor(java.awt.Component.class.getMethod("bounds", new Class[] {})); // NOI18N
            methods[METHOD_bounds12].setDisplayName ( "" );
            methods[METHOD_checkImage13] = new MethodDescriptor(java.awt.Component.class.getMethod("checkImage", new Class[] {java.awt.Image.class, java.awt.image.ImageObserver.class})); // NOI18N
            methods[METHOD_checkImage13].setDisplayName ( "" );
            methods[METHOD_checkImage14] = new MethodDescriptor(java.awt.Component.class.getMethod("checkImage", new Class[] {java.awt.Image.class, int.class, int.class, java.awt.image.ImageObserver.class})); // NOI18N
            methods[METHOD_checkImage14].setDisplayName ( "" );
            methods[METHOD_computeVisibleRect15] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("computeVisibleRect", new Class[] {java.awt.Rectangle.class})); // NOI18N
            methods[METHOD_computeVisibleRect15].setDisplayName ( "" );
            methods[METHOD_contains16] = new MethodDescriptor(java.awt.Component.class.getMethod("contains", new Class[] {java.awt.Point.class})); // NOI18N
            methods[METHOD_contains16].setDisplayName ( "" );
            methods[METHOD_contains17] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("contains", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_contains17].setDisplayName ( "" );
            methods[METHOD_countComponents18] = new MethodDescriptor(java.awt.Container.class.getMethod("countComponents", new Class[] {})); // NOI18N
            methods[METHOD_countComponents18].setDisplayName ( "" );
            methods[METHOD_createImage19] = new MethodDescriptor(java.awt.Component.class.getMethod("createImage", new Class[] {java.awt.image.ImageProducer.class})); // NOI18N
            methods[METHOD_createImage19].setDisplayName ( "" );
            methods[METHOD_createImage20] = new MethodDescriptor(java.awt.Component.class.getMethod("createImage", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_createImage20].setDisplayName ( "" );
            methods[METHOD_createToolTip21] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("createToolTip", new Class[] {})); // NOI18N
            methods[METHOD_createToolTip21].setDisplayName ( "" );
            methods[METHOD_createVolatileImage22] = new MethodDescriptor(java.awt.Component.class.getMethod("createVolatileImage", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_createVolatileImage22].setDisplayName ( "" );
            methods[METHOD_createVolatileImage23] = new MethodDescriptor(java.awt.Component.class.getMethod("createVolatileImage", new Class[] {int.class, int.class, java.awt.ImageCapabilities.class})); // NOI18N
            methods[METHOD_createVolatileImage23].setDisplayName ( "" );
            methods[METHOD_deliverEvent24] = new MethodDescriptor(java.awt.Container.class.getMethod("deliverEvent", new Class[] {java.awt.Event.class})); // NOI18N
            methods[METHOD_deliverEvent24].setDisplayName ( "" );
            methods[METHOD_disable25] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("disable", new Class[] {})); // NOI18N
            methods[METHOD_disable25].setDisplayName ( "" );
            methods[METHOD_dispatchEvent26] = new MethodDescriptor(java.awt.Component.class.getMethod("dispatchEvent", new Class[] {java.awt.AWTEvent.class})); // NOI18N
            methods[METHOD_dispatchEvent26].setDisplayName ( "" );
            methods[METHOD_doLayout27] = new MethodDescriptor(java.awt.Container.class.getMethod("doLayout", new Class[] {})); // NOI18N
            methods[METHOD_doLayout27].setDisplayName ( "" );
            methods[METHOD_enable28] = new MethodDescriptor(java.awt.Component.class.getMethod("enable", new Class[] {boolean.class})); // NOI18N
            methods[METHOD_enable28].setDisplayName ( "" );
            methods[METHOD_enable29] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("enable", new Class[] {})); // NOI18N
            methods[METHOD_enable29].setDisplayName ( "" );
            methods[METHOD_enableInputMethods30] = new MethodDescriptor(java.awt.Component.class.getMethod("enableInputMethods", new Class[] {boolean.class})); // NOI18N
            methods[METHOD_enableInputMethods30].setDisplayName ( "" );
            methods[METHOD_findComponentAt31] = new MethodDescriptor(java.awt.Container.class.getMethod("findComponentAt", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_findComponentAt31].setDisplayName ( "" );
            methods[METHOD_findComponentAt32] = new MethodDescriptor(java.awt.Container.class.getMethod("findComponentAt", new Class[] {java.awt.Point.class})); // NOI18N
            methods[METHOD_findComponentAt32].setDisplayName ( "" );
            methods[METHOD_firePropertyChange33] = new MethodDescriptor(java.awt.Component.class.getMethod("firePropertyChange", new Class[] {java.lang.String.class, byte.class, byte.class})); // NOI18N
            methods[METHOD_firePropertyChange33].setDisplayName ( "" );
            methods[METHOD_firePropertyChange34] = new MethodDescriptor(java.awt.Component.class.getMethod("firePropertyChange", new Class[] {java.lang.String.class, short.class, short.class})); // NOI18N
            methods[METHOD_firePropertyChange34].setDisplayName ( "" );
            methods[METHOD_firePropertyChange35] = new MethodDescriptor(java.awt.Component.class.getMethod("firePropertyChange", new Class[] {java.lang.String.class, long.class, long.class})); // NOI18N
            methods[METHOD_firePropertyChange35].setDisplayName ( "" );
            methods[METHOD_firePropertyChange36] = new MethodDescriptor(java.awt.Component.class.getMethod("firePropertyChange", new Class[] {java.lang.String.class, float.class, float.class})); // NOI18N
            methods[METHOD_firePropertyChange36].setDisplayName ( "" );
            methods[METHOD_firePropertyChange37] = new MethodDescriptor(java.awt.Component.class.getMethod("firePropertyChange", new Class[] {java.lang.String.class, double.class, double.class})); // NOI18N
            methods[METHOD_firePropertyChange37].setDisplayName ( "" );
            methods[METHOD_firePropertyChange38] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("firePropertyChange", new Class[] {java.lang.String.class, boolean.class, boolean.class})); // NOI18N
            methods[METHOD_firePropertyChange38].setDisplayName ( "" );
            methods[METHOD_firePropertyChange39] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("firePropertyChange", new Class[] {java.lang.String.class, int.class, int.class})); // NOI18N
            methods[METHOD_firePropertyChange39].setDisplayName ( "" );
            methods[METHOD_firePropertyChange40] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("firePropertyChange", new Class[] {java.lang.String.class, char.class, char.class})); // NOI18N
            methods[METHOD_firePropertyChange40].setDisplayName ( "" );
            methods[METHOD_getActionForKeyStroke41] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("getActionForKeyStroke", new Class[] {javax.swing.KeyStroke.class})); // NOI18N
            methods[METHOD_getActionForKeyStroke41].setDisplayName ( "" );
            methods[METHOD_getBaseline42] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("getBaseline", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_getBaseline42].setDisplayName ( "" );
            methods[METHOD_getBounds43] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("getBounds", new Class[] {java.awt.Rectangle.class})); // NOI18N
            methods[METHOD_getBounds43].setDisplayName ( "" );
            methods[METHOD_getClientProperty44] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("getClientProperty", new Class[] {java.lang.Object.class})); // NOI18N
            methods[METHOD_getClientProperty44].setDisplayName ( "" );
            methods[METHOD_getComponentAt45] = new MethodDescriptor(java.awt.Container.class.getMethod("getComponentAt", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_getComponentAt45].setDisplayName ( "" );
            methods[METHOD_getComponentAt46] = new MethodDescriptor(java.awt.Container.class.getMethod("getComponentAt", new Class[] {java.awt.Point.class})); // NOI18N
            methods[METHOD_getComponentAt46].setDisplayName ( "" );
            methods[METHOD_getComponentZOrder47] = new MethodDescriptor(java.awt.Container.class.getMethod("getComponentZOrder", new Class[] {java.awt.Component.class})); // NOI18N
            methods[METHOD_getComponentZOrder47].setDisplayName ( "" );
            methods[METHOD_getConditionForKeyStroke48] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("getConditionForKeyStroke", new Class[] {javax.swing.KeyStroke.class})); // NOI18N
            methods[METHOD_getConditionForKeyStroke48].setDisplayName ( "" );
            methods[METHOD_getDefaultLocale49] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("getDefaultLocale", new Class[] {})); // NOI18N
            methods[METHOD_getDefaultLocale49].setDisplayName ( "" );
            methods[METHOD_getFocusTraversalKeys50] = new MethodDescriptor(java.awt.Container.class.getMethod("getFocusTraversalKeys", new Class[] {int.class})); // NOI18N
            methods[METHOD_getFocusTraversalKeys50].setDisplayName ( "" );
            methods[METHOD_getFontMetrics51] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("getFontMetrics", new Class[] {java.awt.Font.class})); // NOI18N
            methods[METHOD_getFontMetrics51].setDisplayName ( "" );
            methods[METHOD_getIndexOf52] = new MethodDescriptor(javax.swing.JLayeredPane.class.getMethod("getIndexOf", new Class[] {java.awt.Component.class})); // NOI18N
            methods[METHOD_getIndexOf52].setDisplayName ( "" );
            methods[METHOD_getInsets53] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("getInsets", new Class[] {java.awt.Insets.class})); // NOI18N
            methods[METHOD_getInsets53].setDisplayName ( "" );
            methods[METHOD_getLayer54] = new MethodDescriptor(javax.swing.JLayeredPane.class.getMethod("getLayer", new Class[] {javax.swing.JComponent.class})); // NOI18N
            methods[METHOD_getLayer54].setDisplayName ( "" );
            methods[METHOD_getLayer55] = new MethodDescriptor(javax.swing.JLayeredPane.class.getMethod("getLayer", new Class[] {java.awt.Component.class})); // NOI18N
            methods[METHOD_getLayer55].setDisplayName ( "" );
            methods[METHOD_getLayeredPaneAbove56] = new MethodDescriptor(javax.swing.JLayeredPane.class.getMethod("getLayeredPaneAbove", new Class[] {java.awt.Component.class})); // NOI18N
            methods[METHOD_getLayeredPaneAbove56].setDisplayName ( "" );
            methods[METHOD_getListeners57] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("getListeners", new Class[] {java.lang.Class.class})); // NOI18N
            methods[METHOD_getListeners57].setDisplayName ( "" );
            methods[METHOD_getLocation58] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("getLocation", new Class[] {java.awt.Point.class})); // NOI18N
            methods[METHOD_getLocation58].setDisplayName ( "" );
            methods[METHOD_getMousePosition59] = new MethodDescriptor(java.awt.Container.class.getMethod("getMousePosition", new Class[] {boolean.class})); // NOI18N
            methods[METHOD_getMousePosition59].setDisplayName ( "" );
            methods[METHOD_getPopupLocation60] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("getPopupLocation", new Class[] {java.awt.event.MouseEvent.class})); // NOI18N
            methods[METHOD_getPopupLocation60].setDisplayName ( "" );
            methods[METHOD_getPosition61] = new MethodDescriptor(javax.swing.JLayeredPane.class.getMethod("getPosition", new Class[] {java.awt.Component.class})); // NOI18N
            methods[METHOD_getPosition61].setDisplayName ( "" );
            methods[METHOD_getPropertyChangeListeners62] = new MethodDescriptor(java.awt.Component.class.getMethod("getPropertyChangeListeners", new Class[] {java.lang.String.class})); // NOI18N
            methods[METHOD_getPropertyChangeListeners62].setDisplayName ( "" );
            methods[METHOD_getSize63] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("getSize", new Class[] {java.awt.Dimension.class})); // NOI18N
            methods[METHOD_getSize63].setDisplayName ( "" );
            methods[METHOD_getToolTipLocation64] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("getToolTipLocation", new Class[] {java.awt.event.MouseEvent.class})); // NOI18N
            methods[METHOD_getToolTipLocation64].setDisplayName ( "" );
            methods[METHOD_getToolTipText65] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("getToolTipText", new Class[] {java.awt.event.MouseEvent.class})); // NOI18N
            methods[METHOD_getToolTipText65].setDisplayName ( "" );
            methods[METHOD_gotFocus66] = new MethodDescriptor(java.awt.Component.class.getMethod("gotFocus", new Class[] {java.awt.Event.class, java.lang.Object.class})); // NOI18N
            methods[METHOD_gotFocus66].setDisplayName ( "" );
            methods[METHOD_grabFocus67] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("grabFocus", new Class[] {})); // NOI18N
            methods[METHOD_grabFocus67].setDisplayName ( "" );
            methods[METHOD_handleEvent68] = new MethodDescriptor(java.awt.Component.class.getMethod("handleEvent", new Class[] {java.awt.Event.class})); // NOI18N
            methods[METHOD_handleEvent68].setDisplayName ( "" );
            methods[METHOD_hasFocus69] = new MethodDescriptor(java.awt.Component.class.getMethod("hasFocus", new Class[] {})); // NOI18N
            methods[METHOD_hasFocus69].setDisplayName ( "" );
            methods[METHOD_hide70] = new MethodDescriptor(fr.masterihm.component.piemenu.menu.JPieMenu.class.getMethod("hide", new Class[] {})); // NOI18N
            methods[METHOD_hide70].setDisplayName ( "" );
            methods[METHOD_highestLayer71] = new MethodDescriptor(javax.swing.JLayeredPane.class.getMethod("highestLayer", new Class[] {})); // NOI18N
            methods[METHOD_highestLayer71].setDisplayName ( "" );
            methods[METHOD_imageUpdate72] = new MethodDescriptor(java.awt.Component.class.getMethod("imageUpdate", new Class[] {java.awt.Image.class, int.class, int.class, int.class, int.class, int.class})); // NOI18N
            methods[METHOD_imageUpdate72].setDisplayName ( "" );
            methods[METHOD_insets73] = new MethodDescriptor(java.awt.Container.class.getMethod("insets", new Class[] {})); // NOI18N
            methods[METHOD_insets73].setDisplayName ( "" );
            methods[METHOD_inside74] = new MethodDescriptor(java.awt.Component.class.getMethod("inside", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_inside74].setDisplayName ( "" );
            methods[METHOD_invalidate75] = new MethodDescriptor(java.awt.Container.class.getMethod("invalidate", new Class[] {})); // NOI18N
            methods[METHOD_invalidate75].setDisplayName ( "" );
            methods[METHOD_isAncestorOf76] = new MethodDescriptor(java.awt.Container.class.getMethod("isAncestorOf", new Class[] {java.awt.Component.class})); // NOI18N
            methods[METHOD_isAncestorOf76].setDisplayName ( "" );
            methods[METHOD_isFocusCycleRoot77] = new MethodDescriptor(java.awt.Container.class.getMethod("isFocusCycleRoot", new Class[] {java.awt.Container.class})); // NOI18N
            methods[METHOD_isFocusCycleRoot77].setDisplayName ( "" );
            methods[METHOD_isLightweightComponent78] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("isLightweightComponent", new Class[] {java.awt.Component.class})); // NOI18N
            methods[METHOD_isLightweightComponent78].setDisplayName ( "" );
            methods[METHOD_keyDown79] = new MethodDescriptor(java.awt.Component.class.getMethod("keyDown", new Class[] {java.awt.Event.class, int.class})); // NOI18N
            methods[METHOD_keyDown79].setDisplayName ( "" );
            methods[METHOD_keyUp80] = new MethodDescriptor(java.awt.Component.class.getMethod("keyUp", new Class[] {java.awt.Event.class, int.class})); // NOI18N
            methods[METHOD_keyUp80].setDisplayName ( "" );
            methods[METHOD_layout81] = new MethodDescriptor(java.awt.Container.class.getMethod("layout", new Class[] {})); // NOI18N
            methods[METHOD_layout81].setDisplayName ( "" );
            methods[METHOD_list82] = new MethodDescriptor(java.awt.Component.class.getMethod("list", new Class[] {})); // NOI18N
            methods[METHOD_list82].setDisplayName ( "" );
            methods[METHOD_list83] = new MethodDescriptor(java.awt.Component.class.getMethod("list", new Class[] {java.io.PrintStream.class})); // NOI18N
            methods[METHOD_list83].setDisplayName ( "" );
            methods[METHOD_list84] = new MethodDescriptor(java.awt.Component.class.getMethod("list", new Class[] {java.io.PrintWriter.class})); // NOI18N
            methods[METHOD_list84].setDisplayName ( "" );
            methods[METHOD_list85] = new MethodDescriptor(java.awt.Container.class.getMethod("list", new Class[] {java.io.PrintStream.class, int.class})); // NOI18N
            methods[METHOD_list85].setDisplayName ( "" );
            methods[METHOD_list86] = new MethodDescriptor(java.awt.Container.class.getMethod("list", new Class[] {java.io.PrintWriter.class, int.class})); // NOI18N
            methods[METHOD_list86].setDisplayName ( "" );
            methods[METHOD_locate87] = new MethodDescriptor(java.awt.Container.class.getMethod("locate", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_locate87].setDisplayName ( "" );
            methods[METHOD_location88] = new MethodDescriptor(java.awt.Component.class.getMethod("location", new Class[] {})); // NOI18N
            methods[METHOD_location88].setDisplayName ( "" );
            methods[METHOD_lostFocus89] = new MethodDescriptor(java.awt.Component.class.getMethod("lostFocus", new Class[] {java.awt.Event.class, java.lang.Object.class})); // NOI18N
            methods[METHOD_lostFocus89].setDisplayName ( "" );
            methods[METHOD_lowestLayer90] = new MethodDescriptor(javax.swing.JLayeredPane.class.getMethod("lowestLayer", new Class[] {})); // NOI18N
            methods[METHOD_lowestLayer90].setDisplayName ( "" );
            methods[METHOD_minimumSize91] = new MethodDescriptor(java.awt.Container.class.getMethod("minimumSize", new Class[] {})); // NOI18N
            methods[METHOD_minimumSize91].setDisplayName ( "" );
            methods[METHOD_mouseDown92] = new MethodDescriptor(java.awt.Component.class.getMethod("mouseDown", new Class[] {java.awt.Event.class, int.class, int.class})); // NOI18N
            methods[METHOD_mouseDown92].setDisplayName ( "" );
            methods[METHOD_mouseDrag93] = new MethodDescriptor(java.awt.Component.class.getMethod("mouseDrag", new Class[] {java.awt.Event.class, int.class, int.class})); // NOI18N
            methods[METHOD_mouseDrag93].setDisplayName ( "" );
            methods[METHOD_mouseEnter94] = new MethodDescriptor(java.awt.Component.class.getMethod("mouseEnter", new Class[] {java.awt.Event.class, int.class, int.class})); // NOI18N
            methods[METHOD_mouseEnter94].setDisplayName ( "" );
            methods[METHOD_mouseExit95] = new MethodDescriptor(java.awt.Component.class.getMethod("mouseExit", new Class[] {java.awt.Event.class, int.class, int.class})); // NOI18N
            methods[METHOD_mouseExit95].setDisplayName ( "" );
            methods[METHOD_mouseMove96] = new MethodDescriptor(java.awt.Component.class.getMethod("mouseMove", new Class[] {java.awt.Event.class, int.class, int.class})); // NOI18N
            methods[METHOD_mouseMove96].setDisplayName ( "" );
            methods[METHOD_mouseUp97] = new MethodDescriptor(java.awt.Component.class.getMethod("mouseUp", new Class[] {java.awt.Event.class, int.class, int.class})); // NOI18N
            methods[METHOD_mouseUp97].setDisplayName ( "" );
            methods[METHOD_move98] = new MethodDescriptor(java.awt.Component.class.getMethod("move", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_move98].setDisplayName ( "" );
            methods[METHOD_moveToBack99] = new MethodDescriptor(javax.swing.JLayeredPane.class.getMethod("moveToBack", new Class[] {java.awt.Component.class})); // NOI18N
            methods[METHOD_moveToBack99].setDisplayName ( "" );
            methods[METHOD_moveToFront100] = new MethodDescriptor(javax.swing.JLayeredPane.class.getMethod("moveToFront", new Class[] {java.awt.Component.class})); // NOI18N
            methods[METHOD_moveToFront100].setDisplayName ( "" );
            methods[METHOD_nextFocus101] = new MethodDescriptor(java.awt.Component.class.getMethod("nextFocus", new Class[] {})); // NOI18N
            methods[METHOD_nextFocus101].setDisplayName ( "" );
            methods[METHOD_paint102] = new MethodDescriptor(fr.masterihm.component.piemenu.menu.JPieMenu.class.getMethod("paint", new Class[] {java.awt.Graphics.class})); // NOI18N
            methods[METHOD_paint102].setDisplayName ( "" );
            methods[METHOD_paintAll103] = new MethodDescriptor(java.awt.Component.class.getMethod("paintAll", new Class[] {java.awt.Graphics.class})); // NOI18N
            methods[METHOD_paintAll103].setDisplayName ( "" );
            methods[METHOD_paintComponents104] = new MethodDescriptor(java.awt.Container.class.getMethod("paintComponents", new Class[] {java.awt.Graphics.class})); // NOI18N
            methods[METHOD_paintComponents104].setDisplayName ( "" );
            methods[METHOD_paintImmediately105] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("paintImmediately", new Class[] {int.class, int.class, int.class, int.class})); // NOI18N
            methods[METHOD_paintImmediately105].setDisplayName ( "" );
            methods[METHOD_paintImmediately106] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("paintImmediately", new Class[] {java.awt.Rectangle.class})); // NOI18N
            methods[METHOD_paintImmediately106].setDisplayName ( "" );
            methods[METHOD_postEvent107] = new MethodDescriptor(java.awt.Component.class.getMethod("postEvent", new Class[] {java.awt.Event.class})); // NOI18N
            methods[METHOD_postEvent107].setDisplayName ( "" );
            methods[METHOD_preferredSize108] = new MethodDescriptor(java.awt.Container.class.getMethod("preferredSize", new Class[] {})); // NOI18N
            methods[METHOD_preferredSize108].setDisplayName ( "" );
            methods[METHOD_prepareImage109] = new MethodDescriptor(java.awt.Component.class.getMethod("prepareImage", new Class[] {java.awt.Image.class, java.awt.image.ImageObserver.class})); // NOI18N
            methods[METHOD_prepareImage109].setDisplayName ( "" );
            methods[METHOD_prepareImage110] = new MethodDescriptor(java.awt.Component.class.getMethod("prepareImage", new Class[] {java.awt.Image.class, int.class, int.class, java.awt.image.ImageObserver.class})); // NOI18N
            methods[METHOD_prepareImage110].setDisplayName ( "" );
            methods[METHOD_print111] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("print", new Class[] {java.awt.Graphics.class})); // NOI18N
            methods[METHOD_print111].setDisplayName ( "" );
            methods[METHOD_printAll112] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("printAll", new Class[] {java.awt.Graphics.class})); // NOI18N
            methods[METHOD_printAll112].setDisplayName ( "" );
            methods[METHOD_printComponents113] = new MethodDescriptor(java.awt.Container.class.getMethod("printComponents", new Class[] {java.awt.Graphics.class})); // NOI18N
            methods[METHOD_printComponents113].setDisplayName ( "" );
            methods[METHOD_putClientProperty114] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("putClientProperty", new Class[] {java.lang.Object.class, java.lang.Object.class})); // NOI18N
            methods[METHOD_putClientProperty114].setDisplayName ( "" );
            methods[METHOD_putLayer115] = new MethodDescriptor(javax.swing.JLayeredPane.class.getMethod("putLayer", new Class[] {javax.swing.JComponent.class, int.class})); // NOI18N
            methods[METHOD_putLayer115].setDisplayName ( "" );
            methods[METHOD_registerKeyboardAction116] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("registerKeyboardAction", new Class[] {java.awt.event.ActionListener.class, java.lang.String.class, javax.swing.KeyStroke.class, int.class})); // NOI18N
            methods[METHOD_registerKeyboardAction116].setDisplayName ( "" );
            methods[METHOD_registerKeyboardAction117] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("registerKeyboardAction", new Class[] {java.awt.event.ActionListener.class, javax.swing.KeyStroke.class, int.class})); // NOI18N
            methods[METHOD_registerKeyboardAction117].setDisplayName ( "" );
            methods[METHOD_remove118] = new MethodDescriptor(java.awt.Component.class.getMethod("remove", new Class[] {java.awt.MenuComponent.class})); // NOI18N
            methods[METHOD_remove118].setDisplayName ( "" );
            methods[METHOD_remove119] = new MethodDescriptor(java.awt.Container.class.getMethod("remove", new Class[] {java.awt.Component.class})); // NOI18N
            methods[METHOD_remove119].setDisplayName ( "" );
            methods[METHOD_remove120] = new MethodDescriptor(javax.swing.JLayeredPane.class.getMethod("remove", new Class[] {int.class})); // NOI18N
            methods[METHOD_remove120].setDisplayName ( "" );
            methods[METHOD_removeAll121] = new MethodDescriptor(javax.swing.JLayeredPane.class.getMethod("removeAll", new Class[] {})); // NOI18N
            methods[METHOD_removeAll121].setDisplayName ( "" );
            methods[METHOD_removeNotify122] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("removeNotify", new Class[] {})); // NOI18N
            methods[METHOD_removeNotify122].setDisplayName ( "" );
            methods[METHOD_removePieMenuItem123] = new MethodDescriptor(fr.masterihm.component.piemenu.menu.JPieMenu.class.getMethod("removePieMenuItem", new Class[] {fr.masterihm.component.piemenu.menu.JPieMenuItem.class})); // NOI18N
            methods[METHOD_removePieMenuItem123].setDisplayName ( "" );
            methods[METHOD_removePropertyChangeListener124] = new MethodDescriptor(java.awt.Component.class.getMethod("removePropertyChangeListener", new Class[] {java.lang.String.class, java.beans.PropertyChangeListener.class})); // NOI18N
            methods[METHOD_removePropertyChangeListener124].setDisplayName ( "" );
            methods[METHOD_repaint125] = new MethodDescriptor(java.awt.Component.class.getMethod("repaint", new Class[] {})); // NOI18N
            methods[METHOD_repaint125].setDisplayName ( "" );
            methods[METHOD_repaint126] = new MethodDescriptor(java.awt.Component.class.getMethod("repaint", new Class[] {long.class})); // NOI18N
            methods[METHOD_repaint126].setDisplayName ( "" );
            methods[METHOD_repaint127] = new MethodDescriptor(java.awt.Component.class.getMethod("repaint", new Class[] {int.class, int.class, int.class, int.class})); // NOI18N
            methods[METHOD_repaint127].setDisplayName ( "" );
            methods[METHOD_repaint128] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("repaint", new Class[] {long.class, int.class, int.class, int.class, int.class})); // NOI18N
            methods[METHOD_repaint128].setDisplayName ( "" );
            methods[METHOD_repaint129] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("repaint", new Class[] {java.awt.Rectangle.class})); // NOI18N
            methods[METHOD_repaint129].setDisplayName ( "" );
            methods[METHOD_requestDefaultFocus130] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("requestDefaultFocus", new Class[] {})); // NOI18N
            methods[METHOD_requestDefaultFocus130].setDisplayName ( "" );
            methods[METHOD_requestFocus131] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("requestFocus", new Class[] {})); // NOI18N
            methods[METHOD_requestFocus131].setDisplayName ( "" );
            methods[METHOD_requestFocus132] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("requestFocus", new Class[] {boolean.class})); // NOI18N
            methods[METHOD_requestFocus132].setDisplayName ( "" );
            methods[METHOD_requestFocusInWindow133] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("requestFocusInWindow", new Class[] {})); // NOI18N
            methods[METHOD_requestFocusInWindow133].setDisplayName ( "" );
            methods[METHOD_resetKeyboardActions134] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("resetKeyboardActions", new Class[] {})); // NOI18N
            methods[METHOD_resetKeyboardActions134].setDisplayName ( "" );
            methods[METHOD_reshape135] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("reshape", new Class[] {int.class, int.class, int.class, int.class})); // NOI18N
            methods[METHOD_reshape135].setDisplayName ( "" );
            methods[METHOD_resize136] = new MethodDescriptor(java.awt.Component.class.getMethod("resize", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_resize136].setDisplayName ( "" );
            methods[METHOD_resize137] = new MethodDescriptor(java.awt.Component.class.getMethod("resize", new Class[] {java.awt.Dimension.class})); // NOI18N
            methods[METHOD_resize137].setDisplayName ( "" );
            methods[METHOD_revalidate138] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("revalidate", new Class[] {})); // NOI18N
            methods[METHOD_revalidate138].setDisplayName ( "" );
            methods[METHOD_scrollRectToVisible139] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("scrollRectToVisible", new Class[] {java.awt.Rectangle.class})); // NOI18N
            methods[METHOD_scrollRectToVisible139].setDisplayName ( "" );
            methods[METHOD_setBounds140] = new MethodDescriptor(java.awt.Component.class.getMethod("setBounds", new Class[] {int.class, int.class, int.class, int.class})); // NOI18N
            methods[METHOD_setBounds140].setDisplayName ( "" );
            methods[METHOD_setComponentZOrder141] = new MethodDescriptor(java.awt.Container.class.getMethod("setComponentZOrder", new Class[] {java.awt.Component.class, int.class})); // NOI18N
            methods[METHOD_setComponentZOrder141].setDisplayName ( "" );
            methods[METHOD_setDefaultLocale142] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("setDefaultLocale", new Class[] {java.util.Locale.class})); // NOI18N
            methods[METHOD_setDefaultLocale142].setDisplayName ( "" );
            methods[METHOD_setLayer143] = new MethodDescriptor(javax.swing.JLayeredPane.class.getMethod("setLayer", new Class[] {java.awt.Component.class, int.class})); // NOI18N
            methods[METHOD_setLayer143].setDisplayName ( "" );
            methods[METHOD_setLayer144] = new MethodDescriptor(javax.swing.JLayeredPane.class.getMethod("setLayer", new Class[] {java.awt.Component.class, int.class, int.class})); // NOI18N
            methods[METHOD_setLayer144].setDisplayName ( "" );
            methods[METHOD_setPosition145] = new MethodDescriptor(javax.swing.JLayeredPane.class.getMethod("setPosition", new Class[] {java.awt.Component.class, int.class})); // NOI18N
            methods[METHOD_setPosition145].setDisplayName ( "" );
            methods[METHOD_show146] = new MethodDescriptor(java.awt.Component.class.getMethod("show", new Class[] {})); // NOI18N
            methods[METHOD_show146].setDisplayName ( "" );
            methods[METHOD_show147] = new MethodDescriptor(java.awt.Component.class.getMethod("show", new Class[] {boolean.class})); // NOI18N
            methods[METHOD_show147].setDisplayName ( "" );
            methods[METHOD_show148] = new MethodDescriptor(fr.masterihm.component.piemenu.menu.JPieMenu.class.getMethod("show", new Class[] {java.awt.Component.class, int.class, int.class})); // NOI18N
            methods[METHOD_show148].setDisplayName ( "" );
            methods[METHOD_size149] = new MethodDescriptor(java.awt.Component.class.getMethod("size", new Class[] {})); // NOI18N
            methods[METHOD_size149].setDisplayName ( "" );
            methods[METHOD_toString150] = new MethodDescriptor(java.awt.Component.class.getMethod("toString", new Class[] {})); // NOI18N
            methods[METHOD_toString150].setDisplayName ( "" );
            methods[METHOD_transferFocus151] = new MethodDescriptor(java.awt.Component.class.getMethod("transferFocus", new Class[] {})); // NOI18N
            methods[METHOD_transferFocus151].setDisplayName ( "" );
            methods[METHOD_transferFocusBackward152] = new MethodDescriptor(java.awt.Component.class.getMethod("transferFocusBackward", new Class[] {})); // NOI18N
            methods[METHOD_transferFocusBackward152].setDisplayName ( "" );
            methods[METHOD_transferFocusDownCycle153] = new MethodDescriptor(java.awt.Container.class.getMethod("transferFocusDownCycle", new Class[] {})); // NOI18N
            methods[METHOD_transferFocusDownCycle153].setDisplayName ( "" );
            methods[METHOD_transferFocusUpCycle154] = new MethodDescriptor(java.awt.Component.class.getMethod("transferFocusUpCycle", new Class[] {})); // NOI18N
            methods[METHOD_transferFocusUpCycle154].setDisplayName ( "" );
            methods[METHOD_unregisterKeyboardAction155] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("unregisterKeyboardAction", new Class[] {javax.swing.KeyStroke.class})); // NOI18N
            methods[METHOD_unregisterKeyboardAction155].setDisplayName ( "" );
            methods[METHOD_update156] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("update", new Class[] {java.awt.Graphics.class})); // NOI18N
            methods[METHOD_update156].setDisplayName ( "" );
            methods[METHOD_updateUI157] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("updateUI", new Class[] {})); // NOI18N
            methods[METHOD_updateUI157].setDisplayName ( "" );
            methods[METHOD_validate158] = new MethodDescriptor(java.awt.Container.class.getMethod("validate", new Class[] {})); // NOI18N
            methods[METHOD_validate158].setDisplayName ( "" );
        }
        catch( Exception e) {}//GEN-HEADEREND:Methods
        // Here you can add code for customizing the methods array.

        return methods;     }//GEN-LAST:Methods

    private static java.awt.Image iconColor16 = null;//GEN-BEGIN:IconsDef
    private static java.awt.Image iconColor32 = null;
    private static java.awt.Image iconMono16 = null;
    private static java.awt.Image iconMono32 = null;//GEN-END:IconsDef
    private static String iconNameC16 = null;//GEN-BEGIN:Icons
    private static String iconNameC32 = null;
    private static String iconNameM16 = null;
    private static String iconNameM32 = null;//GEN-END:Icons

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
