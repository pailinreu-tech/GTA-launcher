# GTA Launcher (Android)

គម្រោង Android សាមញ្ញសម្រាប់បង្កើត APK តាម GitHub Actions។

## មុខងារ
- អេក្រង់ពណ៌ខ្មៅ និង GTA logo ជាអក្សរ
- ប៊ូតុងបើក Minecraft Android (`com.mojang.minecraftpe`) ប្រសិនបើបានដំឡើង
- ទំព័រ Settings សាមញ្ញ
- GitHub Actions បង្កើត debug APK

## របៀបដាក់ក្នុង GitHub តាមទូរសព្ទ
1. បើក repository `GTA-launcher`។
2. Upload ឯកសារ និងថតទាំងអស់ពី ZIP នេះទៅ root របស់ repository។ ត្រូវរក្សារចនាសម្ព័ន្ធថតឱ្យដូចក្នុង ZIP។
3. Workflow នេះដំឡើង Gradle ដោយស្វ័យប្រវត្តិ ដូច្នេះមិនចាំបាច់ប្រើ `gradlew` ឬ wrapper files ដើម្បី Build ទេ។
4. Commit changes ទៅ branch `main` (ឬ `master`)។
5. ចូលផ្ទាំង Actions → `Build GTA Launcher APK` → `Run workflow` ប្រសិនបើ workflow មិនដំណើរការដោយស្វ័យប្រវត្តិ។
6. បើ build ជោគជ័យ បើក run ចុងក្រោយ ហើយនៅផ្នែក Artifacts ទាញយក `GTA-Launcher-debug-APK`។ Extract ZIP រួចដំឡើង `app-debug.apk`។

## ចំណាំ
- នេះជា launcher សម្រាប់បើក Minecraft ដែលបានដំឡើងរួចប៉ុណ្ណោះ។ វាមិនរួមបញ្ចូលហ្គេម Minecraft ឬ bypass ការទិញ/ការផ្ទៀងផ្ទាត់ទេ។
- Debug APK មិនមែនជា release APK ដែលបានចុះហត្ថលេខាសម្រាប់ការចែកចាយទេ។
- Workflow ប្រើ Gradle 8.9 ដែលដំឡើងក្នុង GitHub Actions ដោយស្វ័យប្រវត្តិ ដូច្នេះឯកសារ `gradlew` ដែលមានស្រាប់មិនមែនជាអ្វីដែល workflow ពឹងផ្អែកលើទេ។
