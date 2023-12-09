# how to add items with texture, naming and registering to the game

to create an item is just as simple as instantiating the DeferredRegister class with the forge registry items  and the mod id

```java
public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MCCourseMod.MOD_ID);
```

then you can create as many items as you want, and add custom properties if need be.
name of the item must be unique and lowercase with no spaces

```java
public static final RegistryObject<Item> EXAMPLE_ITEM = ITEMS.register("example_item", () -> new Item(new Item.Properties());
```

and then don't forget to register the items in the mod constructor by passing the IEventBus to the class
and then calling the register method on the DeferredRegister class

```java
// from the ItemInit or your custom name where items are being initialized

public static void register(IEventBus eventBus) {
    ITEMS.register(eventBus);
}

// main class where the mod is being initialized
public MCCourseMod() {
    IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus(); = FMLJavaModLoadingContext.get().getModEventBus();
    ItemInit.register(modEventBus);
    // some other code ...
        
}



```


to make the items appear in a specific tab, in the add creative method you can
use a conditional statement to listen for the tab and then add the item to it

```java
  if (Objects.equals(event.getTabKey(), CreativeModeTabs.INGREDIENTS)) {
     event.accept(ModItems.ALEXANDRITE);
     event.accept(ModItems.RAW_ALEXANDRITE);
  }
```

## adding texture and naming to items

to add texture to an item you will need to create a new folder in the resources folder called assets
and then create a new folder with the mod id and within that folder create three new folder called lang, models and textures
following the following structure

```
assets
    /mod_id
        /lang
            /custom_language_file.json
            /en_us.json
        /models
            /item
                /custom_item_model.json (must match the name of the item given in the DeferredRegister class)
        /textures
            /item
                /custom_item_texture.png (must match the name of the item given in the DeferredRegister class)

