import { test, expect } from '@playwright/test';

test('test', async ({ page }) => {
  await page.goto('https://production.contosotraders.com/');
  await page.getByRole('link', { name: 'All Products' }).first().click();
  await page.getByPlaceholder('Search by product name or').click();
  await page.getByPlaceholder('Search by product name or').fill('xbox');
  await page.getByPlaceholder('Search by product name or').press('Enter');
  await page.getByRole('img', { name: 'Xbox Wireless Controller Mineral Camo Special Edition' }).click();
  await page.getByRole('button', { name: '+' }).click();
  await page.getByRole('button', { name: '+' }).click();
  await page.getByRole('button', { name: '-' }).click();
  await page.getByRole('button', { name: 'Add To Bag' }).click();
  
  await page.getByLabel('cart').click();
  await expect(page.getByTestId('subtotal')).toHaveText('$448.00');
  
});